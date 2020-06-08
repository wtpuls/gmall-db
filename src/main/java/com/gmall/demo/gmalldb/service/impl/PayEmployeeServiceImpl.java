package com.gmall.demo.gmalldb.service.impl;

import com.gmall.demo.gmalldb.mapper.PayEmployeeMapper;
import com.gmall.demo.gmalldb.service.PayEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PayEmployeeServiceImpl implements PayEmployeeService {
    @Autowired
    PayEmployeeMapper payEmployeeMapper;



}
