package com.example.demo.statemachine;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/8/30
 * Time                 : 11:22
 * Description          : 状态机抽象类
 */
public abstract class AbstractStateMachine {

    public Map<String, Map<String, Object>> actionBox;

    public abstract void generateActionBox();

    public abstract Object execute(String action, Map<String, Object> context) throws InvocationTargetException, IllegalAccessException;


}
