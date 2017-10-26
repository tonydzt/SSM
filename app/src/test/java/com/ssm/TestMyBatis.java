package com.ssm;
import com.alibaba.fastjson.JSON;
import com.ssm.pojo.Brand;
import com.ssm.service.IBrandService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMyBatis {

    private static Logger logger = Logger.getLogger(com.ssm.TestMyBatis.class);

    @Resource
    private IBrandService brandService = null;

    @Test
    public void test() {
        Brand brand = brandService.getBrandById(1L);
        logger.info(JSON.toJSONString(brand));
    }
}