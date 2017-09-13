package com.example.demo.statemachine;

import com.example.demo.annotations.StateAnnotation;
import com.example.demo.configration.ActionConfiguration;
import com.example.demo.state.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/9/13
 * Time                 : 10:21
 * Description          :
 */
@Component
public class OrderStateMachine extends AbstractStateMachine {


    @Autowired
    private
    ActionConfiguration actionConfiguration;

    @Autowired
    private
    ApplicationContext applicationContext;

    @Override
    @PostConstruct
    public void generateActionBox() {
        Map<String, Object> beans = applicationContext.getBeansWithAnnotation(StateAnnotation.class);
        List<Map<String,String>> actions =  actionConfiguration.getActions();
        this.actionBox = new HashMap<>();
        for (Map<String, String> action : actions) {
            Map<String, Object> details = new HashMap<>();
            details.put("source",action.get("source"));
            details.put("destination", action.get("destination"));
            details.put("state", (State)beans.get(action.get("state")));
            details.put("method", action.get("method"));
            this.actionBox.put(action.get("name"), details);
        }
    }

    @Override
    public Object execute(String action, Map<String, Object> context) {
        State state = (State) this.actionBox.get(action).get("state");
        Method method = null;
        try {
            method = State.class.getDeclaredMethod(this.actionBox.get(action).get("method").toString(), Map.class);

            return method.invoke(state, new HashMap<String, Object>());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
