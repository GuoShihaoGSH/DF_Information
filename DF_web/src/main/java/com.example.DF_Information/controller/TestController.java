package com.example.DF_Information.controller;

import com.example.DF_Information.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: guoshihao
 * @Date: 2019/1/4 16:52
 * @Description:测试类
 */
@RestController
@RequestMapping("/test")
@Api("测试类相关的api")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
    public String welcome() {
        return testService.test();
    }
}
