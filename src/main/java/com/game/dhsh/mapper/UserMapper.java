package com.game.dhsh.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author liuxiangchao
 */
@Mapper
public interface UserMapper {
    /**
     * 登陆验证
     *
     * @param account 用户名
     * @param password 密码
     * @return 验证是否通过
     */
    Integer login(String account, String password);
}
