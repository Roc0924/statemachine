package roc.statemachine;

import java.util.Map;

/**
 * Create with IntelliJ IDEA
 * Author               : wangzhenpeng
 * Date                 : 2017/8/30
 * Time                 : 11:22
 * Description          : 状态机抽象类
 */
public abstract class AbstractStateMachine<T> {

    public abstract T generateStatus(Object v);

    public abstract void execute(String action, Map<String, Object> context);
}
