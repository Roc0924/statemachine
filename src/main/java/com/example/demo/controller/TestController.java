package com.example.demo.controller;

import com.example.demo.configration.ActionConfiguration;
import com.example.demo.statemachine.OrderStateMachine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/9/13
 * Time                 : 14:21
 * Description          :
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    OrderStateMachine orderStateMachine;


    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public Object test1(@RequestParam(name = "action") String action) {
        return orderStateMachine.execute(action, new HashMap<String, Object>());
    }
}
