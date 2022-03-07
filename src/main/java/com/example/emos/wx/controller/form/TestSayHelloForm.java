package com.example.emos.wx.controller.form;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 *
 * @description:
 * @author: wanghefei$
 * @date: 2022-03-06 20:44
 * @version: 1.0
 */
@ApiModel
@Data
public class TestSayHelloForm {

    // @NotBlank
    // @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$")
    @ApiModelProperty("姓名")
    private String name;

    // @NotBlank
    // @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,15}$")
    // @ApiModelProperty("用户名")
    // private String usernaem;
}
