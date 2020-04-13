package com.lee.itoken.service.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Lists;
import com.lee.itoken.common.domain.SysUser;
import com.lee.itoken.common.dto.BaseResult;
import com.lee.itoken.service.admin.mapper.SysUserMapper;
import com.lee.itoken.service.admin.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Lee
 * @since 2020-04-13
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public BaseResult register(SysUser sysUser) {
        // 先查询是否已经存在该用户名的用户
        SysUser userRecord = getOne(new QueryWrapper<SysUser>().eq("login_code", sysUser.getLoginCode()));
        if (userRecord != null) {
            return BaseResult.notOk(Lists.newArrayList(new BaseResult.Error("", "用户已经存在")));
        }
        // 密码加密
        sysUser.setPassword(DigestUtils.md5DigestAsHex(sysUser.getPassword().getBytes()));
        int insert = sysUserMapper.insert(sysUser);
        if (insert == 1) {
            return BaseResult.ok("注册成功");
        } else {
            return BaseResult.notOk(Lists.newArrayList(new BaseResult.Error("", "注册失败")));
        }
    }

    @Override
    public BaseResult login(String loginCode, String password) {
        QueryWrapper<SysUser> query = new QueryWrapper<>();
        query.eq("login_code", loginCode);
        List<SysUser> sysUsers = sysUserMapper.selectList(query);

        if (sysUsers.size() == 0) {
            return BaseResult.notOk(Lists.newArrayList(new BaseResult.Error("loginCode", "用户不存在")));
        }

        SysUser sysUser = sysUsers.get(0);
        String encodePassword = DigestUtils.md5DigestAsHex(password.getBytes());
        if (!sysUser.getPassword().equals(encodePassword)) {
            return BaseResult.notOk(Lists.newArrayList(new BaseResult.Error("password", "密码不正确")));
        }

        return BaseResult.ok("登录成功");
    }
}
