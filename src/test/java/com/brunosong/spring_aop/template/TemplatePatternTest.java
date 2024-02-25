package com.brunosong.spring_aop.template;

import com.brunosong.spring_aop.template.code.SubClass1;
import com.brunosong.spring_aop.template.code.TemplateClass;
import org.junit.jupiter.api.Test;

public class TemplatePatternTest {

    /* 템플릿 메소드 패턴 테스트 : 공통기능을 슈퍼클래스에 정의하고 서브클래스는 자신만의 기능을 구현해서 공통 기능만 구현하여도
       공통적으로 들어가야 하는 기능을 실행할수 있게 하는 패턴 */
    @Test
    void test(){

        TemplateClass templateClass1 = new SubClass1();
        templateClass1.execute();

        TemplateClass templateClass2 = new SubClass1();
        templateClass2.execute();

    }

}
