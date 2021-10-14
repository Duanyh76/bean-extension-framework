package com.yuhan.bef;

import com.yuhan.bef.annotation.Scene;
import org.springframework.stereotype.Component;

@Scene("A")
@Component
public class HandlerA implements Handler {
    @Override
    public String run(Integer value) {
        return this.getClass().getName() + " " + value;
    }
}
