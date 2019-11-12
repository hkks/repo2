package com.qingcheng.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qingcheng.dao.BrandMapper;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {


    @Autowired
    private  BrandMapper brandMapper;


    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();

    }

    @Override
    public PageResult<Brand> findPage(int i, int i1) {
        return null;
    }

    @Override
    public List<Brand> findList(Map<String, Object> map) {
        return null;
    }

    @Override
    public PageResult<Brand> findPage(Map<String, Object> map, int i, int i1) {
        return null;
    }

    @Override
    public Brand findById(Integer integer) {
        return brandMapper.selectByPrimaryKey(integer);
    }

    @Override
    public void add(Brand brand) {

    }

    @Override
    public void update(Brand brand) {

    }

    @Override
    public void delete(Integer integer) {
        System.out.println(44);
    }
}
