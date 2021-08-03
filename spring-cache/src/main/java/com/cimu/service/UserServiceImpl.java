package com.cimu.service;

import com.cimu.entity.User;
import com.cimu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/28 17:00
 * @since: 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUsers() {
        List<User> users = userMapper.selectList(null);
        return users;
    }
}
