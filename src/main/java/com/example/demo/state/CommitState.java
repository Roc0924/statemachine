package com.example.demo.state;


import com.example.demo.annotations.StateAnnotation;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/8/30
 * Time                 : 16:31
 * Description          :
 */
@StateAnnotation
public class CommitState extends State {
    @Override
    public Object pay(Map<String, Object> context) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "commit -> paid";
    }
}
