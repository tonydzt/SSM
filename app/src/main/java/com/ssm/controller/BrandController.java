package com.ssm.controller;

import com.ssm.pojo.Brand;
import com.ssm.service.IBrandService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dzt
 * @date 17/10/26
 * Hope you know what you have done
 */
@RestController
@RequestMapping("/api/brand")
public class BrandController {

    @Resource
    private IBrandService brandService;

    @RequestMapping(value = "/findById/{brandId}", method = RequestMethod.GET)
    public String testGET(@PathVariable Long brandId) {
        Brand brand = brandService.getBrandById(brandId);
        System.out.println(brand);
        return "success";
    }

    //GET可以自动匹配
    @RequestMapping(value = "/testGET", method = RequestMethod.GET)
    public String testGET(Brand brand) {
        System.out.println(brand.getBarCode());
        System.out.println(brand.getBrandName());
        return "success";
    }

    //POST好像不太能自动匹配,raw JSON类型不行,form-data和x-www-form-urlencode格式可以
    //采购订单的查询方案request的Content-Type是application/x-www-form-urlencoded，所以可以获取到vo
    @RequestMapping(value = "/testPOST")
    public String testPOST(Brand brand) {
        System.out.println(brand.getBarCode());
        System.out.println(brand.getBrandName());
        return "success";
    }
}
