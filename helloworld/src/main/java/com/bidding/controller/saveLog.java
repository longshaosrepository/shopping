package com.bidding.controller;

import org.springframework.scheduling.annotation.Async;

public class saveLog {

    @Async
    public void saveLogs(){
        System.out.print(Thread.currentThread().getName());
    }
}
