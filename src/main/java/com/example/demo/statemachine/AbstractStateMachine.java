package com.example.demo.statemachine;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/8/30
 * Time                 : 11:22
 * Description          : 状态机抽象类
 */
public abstract class AbstractStateMachine {
    BlockingQueue queue = new LinkedBlockingQueue();
    ThreadPoolExecutor executor = new ThreadPoolExecutor(30, 60, 1, TimeUnit.DAYS, queue);

    public Map<String, Map<String, Object>> actionBox;

    public abstract void generateActionBox();

    public abstract Object execute(String action, Map<String, Object> context) throws InvocationTargetException, IllegalAccessException;


}
