package com.yushunxia.service.Impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yushunxia.dao.UserDao;
import com.yushunxia.dto.LoginDto;
import com.yushunxia.entity.UserEntity;
import com.yushunxia.mapper.UserMapper;
import com.yushunxia.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    UserMapper userMapper;

    @Override
    public Map<String, Object> login(LoginDto dto){
        UserEntity user= userMapper.getUserName(dto.getUsername());
        if(user==null){

        }

        return null;
    }
}
