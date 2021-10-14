package com.yuhan.bef;

import org.springframework.beans.BeansException;

public class SceneBeanException extends BeansException {
    public SceneBeanException(String msg) {
        super(msg);
    }

    public SceneBeanException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
