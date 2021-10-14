package com.yuhan.bef;

import com.yuhan.bef.annotation.Scene;
import org.springframework.stereotype.Component;

@Scene("B")
@Component
public class HandlerB implements Handler {
    @Override
    public String run(Integer value) {
        return this.getClass().getName() + " " + value;
    }
}
