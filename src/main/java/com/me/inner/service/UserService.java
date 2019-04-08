package com.me.inner.service;

import com.me.inner.entity.UserEntity;
import com.me.inner.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Me on 2019/4/4.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insertUser(UserEntity user) {
        user.setCreateDate(new Date());
        userMapper.insertUser(user);
    }

    public List<UserEntity> listUser() {
        return userMapper.listUser();
    }
}
