package com.me.inner.mapper;

import com.me.inner.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Me on 2019/4/4.
 */
@Repository
public interface UserMapper {

    void insertUser(UserEntity user);

    List<UserEntity> listUser();
}
