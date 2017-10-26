package com.ssm.service.impl;

import com.ssm.dao.BrandMapper;
import com.ssm.pojo.Brand;
import com.ssm.service.IBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dzt
 * @date 17/10/26
 * Hope you know what you have done
 */
@Service("brandService")
public class BrandServiceImpl implements IBrandService {

    @Resource
    private BrandMapper brandDao;

    @Override
    public Brand getBrandById(Long vendorId) {
        return this.brandDao.selectByPrimaryKey(vendorId);
    }
}
