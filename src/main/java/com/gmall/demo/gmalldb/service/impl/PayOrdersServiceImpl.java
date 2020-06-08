package com.gmall.demo.gmalldb.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gmall.demo.gmalldb.bean.PayOrders;
import com.gmall.demo.gmalldb.mapper.PayOrdersMapper;
import com.gmall.demo.gmalldb.service.PayOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PayOrdersServiceImpl implements PayOrdersService {

    @Autowired
    PayOrdersMapper payOrdersBeanMapper;

    @Override
    public List<PayOrders> getPageOrder(String pagenow, String pagecount, String appkey) {

        Page<PayOrders> payOrdersPage =new Page<>(Integer.parseInt(pagenow),Integer.parseInt(pagecount));

        QueryWrapper<PayOrders> wrapper = new QueryWrapper<>();

        wrapper.eq("Appkey",appkey);

        IPage<PayOrders> payOrdersIPage = payOrdersBeanMapper.selectPage(payOrdersPage,wrapper);

        List<PayOrders> payOrders = payOrdersIPage.getRecords();

        return payOrders;
    }


}
