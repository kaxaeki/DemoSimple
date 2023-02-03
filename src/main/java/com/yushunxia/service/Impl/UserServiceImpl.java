package com.yushunxia.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yushunxia.dto.UserParams;
import com.yushunxia.entity.UserEntity;
import com.yushunxia.mapper.UserMapper;
import com.yushunxia.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<UserEntity> getPage(Page page,@Param("名称") UserParams params) {
        LambdaQueryWrapper<UserEntity> wp = Wrappers.lambdaQuery();
        wp.like(UserEntity::getName, params.getName());
        IPage<UserEntity> result = userMapper.selectPage(page, wp);
        return result.getRecords();
    }

}
