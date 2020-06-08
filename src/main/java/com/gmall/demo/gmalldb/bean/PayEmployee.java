package com.gmall.demo.gmalldb.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PayEmployee {
    @TableField("Id")
    private Integer id;
    @TableField("UserId")
    private String UserId;
    @TableField("UserName")
    private String UserName;
    @TableField("UserPassWord")
    private String UserPassWord;
    @TableField(value ="CreateTime",fill = FieldFill.INSERT)
    private Date CreateTime;
    @TableField(value = "UpdateTime",fill = FieldFill.INSERT_UPDATE)
    private Date UpdateTime;

}
