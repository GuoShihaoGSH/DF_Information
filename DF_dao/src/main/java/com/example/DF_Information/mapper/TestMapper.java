package com.example.DF_Information.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Auther: guo
 * @Date: 2019/1/11 17:01
 * @Description:
 */
@Component("testMapper")
public interface TestMapper {

    String test();
}
