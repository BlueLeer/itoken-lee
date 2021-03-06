package com.lee.itoken.service.admin.service;

import com.lee.itoken.common.dto.BaseResult;
import com.lee.itoken.service.admin.ServiceAdminApplication;
import com.lee.itoken.service.admin.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 模拟测试驱动编程
 *
 * @author lee
 * @date 2019/7/23 14:22
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
//@Profile(value = "dev")
//@Transactional
//@Rollback
public class SysUserServiceTest {
    @Autowired
    private SysUserService sysUserService;

    /**
     * 注册测试
     */
    @Test
    public void testRegister() {
        SysUser user = new SysUser();
        user.setUserCode(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setLoginCode("251668577@qq.com");
        user.setUserName("lee");
        user.setPassword("123456");
        user.setUserType("0");
        user.setMgrType("1");
        user.setStatus("0");
        user.setCreateBy(user.getUserCode());
        user.setCreateDate(LocalDateTime.now());
        user.setUpdateBy(user.getUserCode());
        user.setUpdateDate(LocalDateTime.now());
        user.setCorpCode("001");
        user.setCorpName("lee测试");
        BaseResult register = sysUserService.register(user);
        System.out.println(register);

    }

    /**
     * 登录测试
     */
    @Test
    public void testLogin() {
        BaseResult login = sysUserService.login("251668577@qq.com", "123456");
        System.out.println(login);
    }


}
