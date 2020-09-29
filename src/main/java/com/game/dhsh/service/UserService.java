package com.game.dhsh.service;

import com.game.dhsh.entity.User;

/**
 * @author liuxiangchao
 */
public interface UserService {
    /**
     * 登陆验证
     * @param account 用户名
     * @param password 密码
     * @return 验证是否通过
     */
    Integer login(String account, String password);

}
