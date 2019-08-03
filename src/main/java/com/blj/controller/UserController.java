package com.blj.controller;

import com.blj.pojo.User;
import com.blj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    @Autowired
    private UserService userService;

@RequestMapping("{id}")
@ResponseBody
public User findById(@PathVariable("id") Long id){
    return userService.findUserById(id);
}




}
