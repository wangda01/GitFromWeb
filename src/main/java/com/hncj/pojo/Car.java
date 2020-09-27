package com.hncj.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//使用lombok的注解自动设置getter,setter等方法
@Data                 //设置getter,setter等方法
@AllArgsConstructor  //设置全参构造的
@NoArgsConstructor  //设置空参构造的
public class Car {
    private Integer id;
    private String brand;
    private Double price;
    @JsonFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Date creatDate;
}
