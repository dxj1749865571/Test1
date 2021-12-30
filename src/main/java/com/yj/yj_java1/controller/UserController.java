package com.yj.yj_java1.controller;

import com.yj.yj_java1.entity.Response;
import com.yj.yj_java1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping(value = "/getuseritem",method = RequestMethod.GET)
    public String getuseritem(){
        String dataStr = service.GetUserInfo().toString();
        return dataStr;
    }
    @RequestMapping(value = "/adduserinfo",method = RequestMethod.GET)
    public Response addUserInfo(){
        service.addUserInfo();
        Response response = new Response();
        response.setCode(100001);
        response.setMsg("添加成功");
        return response;
    }
    void Test(){

    }
}
