package com.brunosong.spring_aop.strategy_pattern;

import com.brunosong.spring_aop.strategy_pattern.code.ContextV1;
import com.brunosong.spring_aop.strategy_pattern.code.Strategy;
import com.brunosong.spring_aop.strategy_pattern.code.StrategyClass1;
import com.brunosong.spring_aop.strategy_pattern.code.StrategyClass2;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    void strategyTest1() {

        Strategy strategy1 = new StrategyClass1();
        ContextV1 context1 = new ContextV1(strategy1);
        context1.execute();

        Strategy strategy2 = new StrategyClass2();
        ContextV1 context2 = new ContextV1(strategy2);
        context2.execute();


    }
}
