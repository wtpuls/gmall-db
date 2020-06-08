package com.gmall.demo.gmalldb.controller;


import com.gmall.demo.gmalldb.bean.PayMerchant;
import com.gmall.demo.gmalldb.bean.PayOrders;
import com.gmall.demo.gmalldb.service.PayMerchantService;
import com.gmall.demo.gmalldb.service.PayOrdersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
@Api(tags = "测试商户管理")
public class MerchantController {
    @Autowired
    PayMerchantService payMerchantService;

    @GetMapping("/getAll")
    @ResponseBody
    @ApiOperation("查询所有商户信息")
    public List<PayMerchant> getAll(){
        List<PayMerchant> payMerchants = payMerchantService.getAll();
        return payMerchants;
    }
    @PostMapping("/insertList")
    @ResponseBody
    @ApiOperation("新增商户信息")

    public String insertList(@RequestBody PayMerchant payMerchant,@RequestParam("file") MultipartFile file){
        payMerchantService.insertList(payMerchant, file);
        return "success";
    }
    @PostMapping("/delectById")
    @ResponseBody
    @ApiOperation("删除商户信息")
    public String delectById(String id){
        payMerchantService.delectById(id);
        return "success";
    }
    @PostMapping("/update")
    @ResponseBody
    @ApiOperation("修改商户信息")
    public String update(@RequestBody PayMerchant payMerchant){
        payMerchantService.update(payMerchant);
        return "success";
    }
    @GetMapping("/getPage/{pagenow}/{pagecount}")
    @ResponseBody
    @ApiOperation("所有商户信息分页")
    public List<PayMerchant> getPage(@PathVariable String pagenow,@PathVariable String pagecount){
        List<PayMerchant> payMerchants = payMerchantService.getPage(pagenow,pagecount);
        return payMerchants;
    }
    @Autowired
    PayOrdersService payOrdersService;

    @GetMapping("/getPageOrder/{pagenow}/{pagecount}/{Appkey}")
    @ResponseBody
    @ApiOperation("根据Appkey查询商户对应订单信息并进行分页")
    public List<PayOrders> getPageOrder(@PathVariable String pagenow, @PathVariable String pagecount,@PathVariable String Appkey){
        List<PayOrders> payOrders =  payOrdersService.getPageOrder(pagenow,pagecount,Appkey);
        return payOrders;
    }

}
