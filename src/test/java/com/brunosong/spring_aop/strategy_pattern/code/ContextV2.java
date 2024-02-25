package com.brunosong.spring_aop.strategy_pattern.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContextV2 {

    public void execute(Strategy strategy) {
        Long startTime = System.currentTimeMillis();

        //비즈니스 로직 시작
        strategy.run();
        //비즈니스 로직 끝

        Long endTime = System.currentTimeMillis();
        log.info("time is {}", endTime - startTime);
    }

}
