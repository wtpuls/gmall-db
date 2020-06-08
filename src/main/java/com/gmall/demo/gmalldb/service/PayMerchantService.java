package com.gmall.demo.gmalldb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gmall.demo.gmalldb.bean.PayMerchant;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PayMerchantService extends IService<PayMerchant> {
    List<PayMerchant> getAll();

    String  insertList(PayMerchant payMerchant, MultipartFile file);

    void delectById(String id);

    void update(PayMerchant payMerchant);

    List<PayMerchant> getPage(String pagenow, String pagecount);


}
