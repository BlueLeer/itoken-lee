package com.lee.itoken.service.admin.service;

import com.lee.itoken.service.admin.ServiceAdminApplication;
import com.lee.itoken.service.admin.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author WangLe
 * @date 2019/7/23 14:22
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
public class SysUserServiceTest {
    @Autowired
    private ISysUserService iSysUserService;

    @Test
    public void test() {
        SysUser sysUser = new SysUser();
        iSysUserService.save(sysUser);
    }
}
