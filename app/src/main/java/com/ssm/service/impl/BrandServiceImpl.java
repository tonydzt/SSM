package com.ssm.service.impl;

import com.ssm.mapper.BrandMapper;
import com.ssm.pojo.Brand;
import com.ssm.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dzt
 * @date 17/10/26
 * Hope you know what you have done
 */
@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Brand getBrandById(Long brandId) {
        return this.brandMapper.getOne(brandId);
    }
}
