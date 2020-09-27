package com.hncj.controller;

import com.hncj.pojo.HncjUser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/hncj")
public class HncjController {

    private List<HncjUser> list = Collections.synchronizedList(new ArrayList<>());

    @PostMapping("/user")
    public String addUser(HncjUser user) {
        list.add(user);
        return "success";
    }

    @GetMapping("/user")
    public List<HncjUser> findAll() {
        return list;
    }

    @GetMapping("/user/{id}")
    public HncjUser findOne(@PathVariable("id") Long id) {
        for (HncjUser user : list){
            if (user.getId().longValue() ==  id.longValue()){
                  return user;
            }
        }
        return null;
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable("id") Long id,HncjUser user){
        for (HncjUser hncjUser : list){
            if (hncjUser.getId().longValue() == id.longValue()){
                hncjUser.setName(user.getName());
                hncjUser.setAge(user.getAge());
            }
        }
        return "success";

    }

    @DeleteMapping("/user/{id}")
    public String delUser(@PathVariable("id") Long id){
         list.remove(this.findOne(id));
         return "success";
    }



}