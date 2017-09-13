package com.example.demo.state;

import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/8/30
 * Time                 : 10:57
 * Description          : 状态父类
 */
public abstract class State {

    /**
     * 支付动作
     * @param context
     * @return
     */
    public Object pay(Map<String, Object> context){
        return null;
    }

    /**
     * 发货动作
     * @param context
     * @return
     */
    public Object delivery(Map<String, Object> context){
        return null;
    }

}
