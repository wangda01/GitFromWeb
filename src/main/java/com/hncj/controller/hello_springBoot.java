package com.hncj.controller;

import com.hncj.pojo.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/test")
public class hello_springBoot {

    @Value("${hncj.ip}")
    private String hncj_ip;
    @Value("${hncj.port}")
    private String hncj_port;


    @RequestMapping("/hello")
    public String test(){
        return "这是springBoot的第一个Demo";
    }

    @RequestMapping("/findOne")
    public Car findOne(){
        return new Car(1001,"五菱",30000.0,new Date());
    }

    @RequestMapping("/findAll")
    public List<Car> findAll(){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(1002,"红旗",22000.0,new Date()));
        cars.add(new Car(1003,"东风",23000.0,new Date()));
        cars.add(new Car(1004,"奇瑞",24000.0,new Date()));
        return cars;
    }


//**********************测试配置文件的*********************************************

    @RequestMapping("/getHncj")
    public String getHncj(){
        return "ip" + hncj_ip + ",port" + hncj_port;
    }

}
