package com.yuhan.bef;

import com.yuhan.bef.annotation.Scene;
import com.yuhan.bef.config.SpringBeanLoader;
import org.springframework.beans.BeansException;
import org.springframework.util.Assert;

import java.util.Map;

public class SceneBeanFactory {

    public static <T> T getBean(Class<T> clazz, String sceneValue) throws BeansException {
        Assert.notNull(clazz, "Bean class is null");
        Assert.notNull(sceneValue, "SceneValue is null");

        Map<String, T> beans = SpringBeanLoader.getBeansOfType(clazz);
        if (beans.isEmpty()) {
            throw new SceneBeanException("Can't find " + clazz.getName() + " class");
        }

        T t = null;
        for (T bean : beans.values()) {
            Scene sceneAnnotation = bean.getClass().getAnnotation(Scene.class);
            if (sceneAnnotation == null) {
                continue;
            }
            if (!sceneValue.equals(sceneAnnotation.value())) {
                continue;
            }
            if (t != null) {
                throw new SceneBeanException("Matched too many " + sceneValue + " bean");
            }
            t = bean;
        }
        if (t == null) {
            throw new SceneBeanException("Can't find " + sceneValue + " bean");
        }
        return t;
    }

}
