package com.lee.itoken.web.admin.service;

import com.lee.itoken.common.dto.BaseResult;
import com.lee.itoken.common.web.service.BaseClientService;
import com.lee.itoken.web.admin.service.fallback.AdminServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lee
 * @date 2020/4/13 16:40
 */
@FeignClient(value = "itoken-service-admin", fallback = AdminServiceFallback.class)
public interface AdminService extends BaseClientService {
    @RequestMapping(value = "/sysUser/login", method = RequestMethod.GET)
    BaseResult login(@RequestParam(required = true, value = "loginCode") String loginCode,
                     @RequestParam(required = true, value = "password") String password);
}
