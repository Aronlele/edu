package com.bamboocloud.qustedudemo.service.impl;

import com.bamboocloud.qustedudemo.entity.UserEntity;
import com.bamboocloud.qustedudemo.mapper.UserMapper;
import com.bamboocloud.qustedudemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * .
 *
 * @author 薛乐乐
 * @date 2021/7/18 18:08
 * @since
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity getUser() {
        return userMapper.selectById(1);
    }
}
