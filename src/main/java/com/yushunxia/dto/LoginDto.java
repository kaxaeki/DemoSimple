package com.yushunxia.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel(value = "login form")
public class LoginDto {
    @ApiModelProperty(value = "username")
    @NotBlank(message="{api.mobile.require}")
    private String username;
    @ApiModelProperty(value = "password")
    @NotBlank(message = "{}")
    private String password;

}
