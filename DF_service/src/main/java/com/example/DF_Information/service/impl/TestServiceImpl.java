package com.example.DF_Information.service.impl;

import com.example.DF_Information.mapper.TestMapper;
import com.example.DF_Information.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: guoshihao
 * @Date: 2019/1/11 17:00
 * @Description:
 */
@Service("testService")
public class TestServiceImpl implements TestService {
//    @Autowired
    private TestMapper testMapper;
    @Override
    public String test() {
        return "aaaaaaaaa";
    }
}
