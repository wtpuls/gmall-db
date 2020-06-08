package com.gmall.demo.gmalldb.service;

import com.gmall.demo.gmalldb.bean.PayOrders;

import java.util.List;

public interface PayOrdersService {

    List<PayOrders> getPageOrder(String pagenow, String pagecount, String appkey);
}
