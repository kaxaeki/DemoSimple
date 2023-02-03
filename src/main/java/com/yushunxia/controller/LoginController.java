package com.yushunxia.controller;

import com.yushunxia.dto.LoginDto;
import com.yushunxia.service.Impl.LoginServiceImpl;
import com.yushunxia.service.LoginService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("login")
    @ApiOperation("login")
    public Map<String, Object> login(@RequestBody LoginDto dto){

        Map<String, Object> data = loginService.login(dto);
        return data;
    }

}
