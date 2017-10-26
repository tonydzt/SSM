package com.ssm.controller;

import com.ssm.service.IBrandService;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/showBrand")
    public String showBrand() {
        return brandService.getBrandById(100010L).toString();
    }
}
