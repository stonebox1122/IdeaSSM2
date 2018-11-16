package com.stone.web.service.impl;
import com.stone.web.mapper.UserEntityMapper;
import com.stone.web.po.UserEntity;
import com.stone.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Desc:用户表相关的servie接口实现类
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;

    @Override
    public List<UserEntity> getAllUsers() {
        return mapper.getAllUsers();
    }
}
