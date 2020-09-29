package com.game.dhsh.entity;

import lombok.Data;
import org.springframework.stereotype.Component;
import sun.security.util.Password;

/**
 * @author liuxiangchao
 */
@Data
public class User {
    /**
     * 账号
     */
    private String account;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
