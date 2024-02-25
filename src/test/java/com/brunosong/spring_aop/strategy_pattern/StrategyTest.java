package com.brunosong.spring_aop.strategy_pattern;

import com.brunosong.spring_aop.strategy_pattern.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class StrategyTest {

    /**
     * 전략을 인터페이스로 만들어서 선 조립후 후 실행을 하게 한다.
     */
    @Test
    void strategyTest1() {

        Strategy strategy1 = new StrategyClass1();
        ContextV1 context1 = new ContextV1(strategy1);
        context1.execute();

        Strategy strategy2 = new StrategyClass2();
        ContextV1 context2 = new ContextV1(strategy2);
        context2.execute();
    }



    /**
     * 전략을 Context에서 사용할때 주입시켜 준다.
     */
    @Test
    void strategyTest2() {

        Strategy strategy1 = new StrategyClass1();
        ContextV2 context1 = new ContextV2();
        context1.execute(strategy1);

        ContextV2 context2 = new ContextV2();
        context2.execute(new StrategyClass2());

        ContextV2 context3 = new ContextV2();
        context3.execute(() -> {
            log.info("비즈니스 로직 3실행");
        });


    }










}
