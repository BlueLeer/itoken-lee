package com.lee.itoken.service.admin.service;

import com.lee.itoken.common.domain.SysUser;
import com.lee.itoken.common.dto.BaseResult;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Lee
 * @since 2020-04-13
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 用户注册
     *
     * @param sysUser
     */
    BaseResult register(SysUser sysUser);

    /**
     * 用户登录
     *
     * @param loginCode 登录名
     * @param password  密码,密文密码
     */
    BaseResult login(String loginCode, String password);
}
