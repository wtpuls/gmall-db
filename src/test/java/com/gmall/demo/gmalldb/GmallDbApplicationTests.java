package com.gmall.demo.gmalldb;

import com.gmall.demo.gmalldb.bean.PayEmployee;
import com.gmall.demo.gmalldb.mapper.PayEmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallDbApplicationTests {
    @Autowired
    PayEmployeeMapper payEmployeeMapper;
    @Test
    void contextLoads() {

    }
    @Test
    public void testInsert(){
        PayEmployee payEmployee = new PayEmployee();
        payEmployee.setId(4);
        payEmployee.setUserId("4");
        payEmployee.setUserName("之谦");
        payEmployee.setUserPassWord("123456");
        int result = payEmployeeMapper.insert(payEmployee);
        System.out.println(result);
        System.out.println(payEmployee);
    }
    @Test
    public void testUpdate(){
        PayEmployee payEmployee = new PayEmployee();
        payEmployee.setId(4);
        payEmployee.setUserName("彦祖");
        payEmployee.setUserPassWord("123");
        int i =payEmployeeMapper.updateById(payEmployee);
        System.out.println(i);
    }

}
