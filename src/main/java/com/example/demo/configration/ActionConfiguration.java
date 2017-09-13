package com.example.demo.configration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/9/13
 * Time                 : 14:29
 * Description          :
 */
@Component
@ConfigurationProperties(prefix = "statemachine")
public class ActionConfiguration {

    List<Map<String, String>> actions = new ArrayList<>();

    public List<Map<String, String>> getActions() {
        return actions;
    }

    public void setActions(List<Map<String, String>> actions) {
        this.actions = actions;
    }


}
