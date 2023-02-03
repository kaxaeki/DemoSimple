package com.yushunxia.service;


import com.yushunxia.dto.LoginDto;

import java.util.Map;

public interface LoginService {

   Map<String, Object> login(LoginDto dto);
}
