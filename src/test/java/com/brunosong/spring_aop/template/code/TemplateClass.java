package com.brunosong.spring_aop.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class TemplateClass {

    public void execute() {

        Long startTime = System.currentTimeMillis();
        //비즈니스 로직 시작
        run();
        //비즈니스 로직 끝
        Long endTime = System.currentTimeMillis();
        log.info("time is {}", endTime - startTime);
    }

    abstract protected void run();

}
