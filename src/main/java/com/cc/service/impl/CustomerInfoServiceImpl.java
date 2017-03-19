package com.cc.service.impl;

import com.cc.dao.CustomerInfoMapper;
import com.cc.pojo.CustomerInfo;
import com.cc.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cc on 2017/3/1.
 */
@Service("customerInfoService")
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    private CustomerInfoMapper customerInfoMapper;


    @Override
    public List<CustomerInfo> getAllCustomerInfo() {
        return customerInfoMapper.getCustomerList();
    }

    @Override
    public CustomerInfo getOneCustomer(Integer id) {
        return customerInfoMapper.getOneCustomer(id);
    }

    @Override
    public void insertCustomerInfo(CustomerInfo customerInfo) {

    }
}
