package com.guet.controller;

import com.guet.domain.UserInfo;
import com.guet.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class UserInfoController {
    @Autowired
    private IUserInfoService iUserInfoService;
    @RequestMapping("/findAll")
        public String findAll(Model model){
            System.out.println("Controller表现层：查询所有账户...");
            List<UserInfo> list = iUserInfoService.findAll();
            model.addAttribute("list",list);
            return "list";
        }
    @RequestMapping("/save")
    public void save(UserInfo account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        iUserInfoService.saveUser(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
//测试github

    }

