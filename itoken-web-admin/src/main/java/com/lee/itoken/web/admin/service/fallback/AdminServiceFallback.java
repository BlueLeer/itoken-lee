package com.lee.itoken.web.admin.service.fallback;

import com.lee.itoken.common.dto.BaseResult;
import com.lee.itoken.web.admin.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author lee
 * @date 2020/4/13 17:04
 */
@Slf4j
@Component
public class AdminServiceFallback implements AdminService {
    public BaseResult login(String loginCode, String password) {
        log.error("调用失败!");
        return null;
    }
}
