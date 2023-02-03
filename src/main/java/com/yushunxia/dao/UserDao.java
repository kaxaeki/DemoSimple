package com.yushunxia.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserDao extends BaseMapper {
    Map getUserName(String username);
}
