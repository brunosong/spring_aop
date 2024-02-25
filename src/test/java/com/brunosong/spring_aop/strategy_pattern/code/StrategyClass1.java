package com.brunosong.spring_aop.strategy_pattern.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyClass1 implements Strategy {

    @Override
    public void run() {
        log.info("비즈니스 로직 1");
    }

}
