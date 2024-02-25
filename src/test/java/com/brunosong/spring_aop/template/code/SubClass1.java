package com.brunosong.spring_aop.template.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClass1 extends TemplateClass {

    @Override
    protected void run() {
        //실제 비즈니스 로직이 들어간다.
        log.info("SubClass1 의 비즈니스 로직이 실행");
    }
}
