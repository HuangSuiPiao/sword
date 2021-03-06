package com.huangsuip.service.user.impl;


import com.huangsuip.common.po.User;
import com.huangsuip.common.po.UserLogin;
import com.huangsuip.framework.util.JSONUtils;
import com.huangsuip.service.mapper.UserMapper;
import com.huangsuip.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author HuangSuip
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDetailServiceImpl userDetailService;
    private boolean b = true;

    @Override
    public UserLogin login(String name, String psw) {
        return userDetailService.loadUserByUsername(name);
    }

    @Override
    @Transactional
    public void insertUser(User u) {
        userMapper.insert(u);
        if (u.getUserId() > 500) {
            //TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }

    @Override
    public User getUserById(Long id) {
        User user = userMapper.selectById(id);
        if (b) {
            b = false;
            throw new SecurityException("UserServiceImpl.getUserById");
        }
        b = true;
        return user;
    }

    @Override
    @Transactional
    public void updateUser(final User user) {
        userMapper.updateById(user);
        if (user.getUserId() > 500) {
            //TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            throw new RuntimeException("失败");
        }
    }

    @Override
    @Transactional
    public void all() {
        User u = new User();
        try {
            u.setUserId((long) (Math.random() * 1000));
            u.setName("User Inster MinQiong");
            this.insertUser(u);
        } catch (Exception e) {
            logger.info("插入失败: " + JSONUtils.toJSONString(u));
        }
        try {
            u.setName("User Update HuangMinQ");
            this.updateUser(u);
        } catch (Exception e) {
            logger.info("更新失败: " + JSONUtils.toJSONString(u));
            throw e;
        }
    }
}
