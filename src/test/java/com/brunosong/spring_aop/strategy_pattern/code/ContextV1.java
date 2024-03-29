package com.brunosong.spring_aop.strategy_pattern.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContextV1 {

    private final Strategy strategy;

    public ContextV1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {

        Long startTime = System.currentTimeMillis();

        //비즈니스 로직 시작
        strategy.run();
        //비즈니스 로직 끝

        Long endTime = System.currentTimeMillis();
        log.info("time is {}", endTime - startTime);

    }

}
