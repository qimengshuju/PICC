package com.cc.service.impl;

import com.cc.dao.CustomerInfoMapper;
import com.cc.pojo.CustomerInfo;
import com.cc.pojo.CustomerInfoExample;
import com.cc.pojo.Page;
import com.cc.pojo.UserInfo;
import com.cc.service.CustomerInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
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
    public List<CustomerInfo> getAllCustomerInfo(Page page) {
        return customerInfoMapper.getCustomerList(page);

    }

    @Override
    public CustomerInfo getOneCustomer(Integer id) {
        return customerInfoMapper.getOneCustomer(id);
    }

    @Override
    public PageInfo<CustomerInfo> queryByPage(Integer pageNum, Integer pageSize) {



//        PageHelper.startPage(pageNum, pageSize);
//        List<CustomerInfo> list = customerInfoMapper.getCustomerList();
//        System.out.println("pagesize:"+list.size());
//        //用PageInfo对结果进行包装
//        PageInfo<CustomerInfo> page = new PageInfo<CustomerInfo>(list);
//        //测试PageInfo全部属性
//        System.out.println("pagesize:"+page.getPageSize());
        return null;
    }

    @Override
    public void insertCustomerInfo(CustomerInfo customerInfo) {

    }
}
