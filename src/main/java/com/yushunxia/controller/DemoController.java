package com.yushunxia.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yushunxia.dto.UserParams;
import com.yushunxia.entity.UserEntity;
import com.yushunxia.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
@Api(tags = "测试")
public class DemoController {

    @Resource
    private UserService userService;

    @PostMapping("user")
    @ResponseBody
    public List sayTest(){
        return userService.getAllUser();
    };

    @PostMapping(value = "page")
    @ResponseBody
    @ApiOperation("分页")
    public List<UserEntity> getPage(Page page, @RequestBody UserParams params){
        return userService.getPage(page, params);
    };
}
