package com.example.demo.state;


import com.example.demo.annotations.StateAnnotation;

import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/9/13
 * Time                 : 10:19
 * Description          :
 */
@StateAnnotation
public class PaidState extends State {
    @Override
    public Object delivery(Map<String, Object> context) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "paid -> delivery";
    }
}
