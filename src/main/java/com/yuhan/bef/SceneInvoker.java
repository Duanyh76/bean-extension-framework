package com.yuhan.bef;

import java.util.function.Function;

public class SceneInvoker {

    public static <T, R> R execute(Class<T> clazz, String sceneCode, Function<T, R> function) {
        T bean = SceneBeanFactory.getBean(clazz, sceneCode);
        return function.apply(bean);
    }
}
