package com.yuhan.bef;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BefTest {

    public static void main(String[] args) {
        System.out.println("here");
    }

    @Test
    public void factoryTest() {
        Handler a = SceneBeanFactory.getBean(Handler.class, "A");
        String resultA = a.run(1);
        System.out.println(resultA);

        Handler b = SceneBeanFactory.getBean(Handler.class, "B");
        String resultB = b.run(2);
        System.out.println(resultB);
    }

    @Test
    public void invokerTest(){
        String resultA = SceneInvoker.execute(Handler.class, "A", handler -> handler.run(1));
        System.out.println(resultA);

        String resultB = SceneInvoker.execute(Handler.class, "B", handler -> handler.run(2));
        System.out.println(resultB);
    }

}
