package com.lee.itoken.web.admin.controller;

import com.lee.itoken.common.dto.BaseResult;
import com.lee.itoken.common.web.controller.BaseController;
import com.lee.itoken.web.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class AdminController extends BaseController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    @ResponseBody
    public BaseResult login(String loginCode, String password) {
        BaseResult login = adminService.login(loginCode, password);
        return login;
    }
}
