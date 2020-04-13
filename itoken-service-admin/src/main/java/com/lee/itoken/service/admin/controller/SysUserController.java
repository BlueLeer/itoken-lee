package com.lee.itoken.service.admin.controller;


import com.google.common.collect.Lists;
import com.lee.itoken.common.domain.SysUser;
import com.lee.itoken.common.dto.BaseResult;
import com.lee.itoken.service.admin.service.SysUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author Lee
 * @since 2020-04-13
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value = "/login")
    public BaseResult login(String loginCode, String password) {
        BaseResult result = sysUserService.login(loginCode, password);
        return result;
    }

    private List<BaseResult.Error> validate(String loginCode, String password) {
        List<BaseResult.Error> errors = Lists.newArrayList();
        if (StringUtils.isEmpty(loginCode)) {
            errors.add(new BaseResult.Error("loginCode", "登录名为空"));
        }
        if (StringUtils.isEmpty(password)) {
            errors.add(new BaseResult.Error("password", "密码为空"));
        }

        return errors;
    }

    @GetMapping(value = "/register")
    public BaseResult register(String username, String loginCode, String password) {
        SysUser sysUser = new SysUser();
        sysUser.setLoginCode(loginCode);
        sysUser.setPassword(password);

        sysUser.setUserCode(UUID.randomUUID().toString().replace("-", ""));
        sysUser.setUserName(username);
        // 0代表管理员用户 1代表会员用户
        sysUser.setUserType("0");
        sysUser.setMgrType("1");
        sysUser.setCreateBy("root");
        sysUser.setUpdateBy("root");
        sysUser.setUpdateDate(LocalDateTime.now());
        sysUser.setCreateDate(LocalDateTime.now());
        sysUser.setCorpCode("000001");
        sysUser.setCorpName("系统");


        BaseResult register = sysUserService.register(sysUser);
        return register;
    }
}
