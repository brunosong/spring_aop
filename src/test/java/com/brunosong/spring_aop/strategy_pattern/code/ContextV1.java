package com.brunosong.spring_aop.strategy_pattern.code;

public class ContextV1 {

    private final Strategy strategy;

    public ContextV1(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        strategy.run();
    }

}
