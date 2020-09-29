package com.game.dhsh.service.impl;

import com.game.dhsh.mapper.UserMapper;
import com.game.dhsh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liuxiangchao
 */
@Service
public class UserServiceImpl implements UserService {


    private UserMapper userMapper;
    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 登陆验证     *
     * @param account 用户名
     * @param password 密码
     * @return 验证是否通过
     */

    @Override
    public Integer login(String account, String password) {
        return userMapper.login(account,password);
    }
}
