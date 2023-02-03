package com.yushunxia.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yushunxia.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
    List getAllUser();

    UserEntity getUserName(String username);
}