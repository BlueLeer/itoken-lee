package com.lee.itoken.service.admin.service;

import com.lee.itoken.service.admin.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author lee
 * @since 2019-07-23
 */
public interface ISysUserService extends IService<SysUser> {
    /**
     * 用户注册
     * @param sysUser
     */
    boolean register(SysUser sysUser);

    /**
     * 用户登录
     * @param loginCode 登录名
     * @param password
     */
    SysUser login(String loginCode, String password);
}
