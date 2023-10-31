package com.example.internalserver;

import org.springframework.stereotype.Service;

@Service
public class InternalService {
ㅌ
    public void delayedLogicWithoutReturn() throws InterruptedException {
        int a = 100;
        Thread.sleep(10000L);
        for (int i = 0; i < 100; i++) {
            a++;
        }
        System.out.println("result a : " + a);
    }

    public String delayedLogicWithReturn() throws InterruptedException {
        int a = 100;
        Thread.sleep(10000L);
        for (int i = 0; i < 100; i++) {
            a++;
        }
        return "result a : " + a;
    }
}
