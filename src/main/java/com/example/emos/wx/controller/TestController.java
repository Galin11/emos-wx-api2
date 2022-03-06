package com.example.emos.wx.controller;

import com.example.emos.wx.common.util.R;
import com.example.emos.wx.controller.form.TestSayHelloForm;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @description:
 * @author: wanghefei$
 * @date: 2022-03-06 20:06
 * @version: 1.0
 */

@RestController
@RequestMapping("/test")
@Api("测试web接口")
public class TestController {

    @PostMapping("/sayHello")
    @ApiOperation("测试登录接口")
    public R sayHello(@Validated @RequestBody TestSayHelloForm form){
        return R.ok("Hello world!!!---"+form.getName());
    }

}
