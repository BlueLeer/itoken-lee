package com.lee.itoken.service.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lee.itoken.service.admin.entity.SysUser;
import com.lee.itoken.service.admin.mapper.SysUserMapper;
import com.lee.itoken.service.admin.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lee
 * @since 2019-07-23
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public boolean register(SysUser sysUser) {
        sysUser.setPassword(DigestUtils.md5DigestAsHex(sysUser.getPassword().getBytes()));
        int insert = sysUserMapper.insert(sysUser);
        return insert == 1;
    }

    @Override
    public SysUser login(String loginCode, String password) {
        QueryWrapper<SysUser> qw = new QueryWrapper<>();
        qw.eq("login_code", loginCode);
        SysUser one = getOne(qw);
        return one;
    }
}
