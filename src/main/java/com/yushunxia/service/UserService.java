package com.yushunxia.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yushunxia.dto.UserParams;
import com.yushunxia.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List getAllUser();

    List<UserEntity> getPage(Page page, UserParams params);
}
