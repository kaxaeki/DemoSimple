package com.yushunxia.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserParams {
    @ApiModelProperty("名称")
    private String name;

}
