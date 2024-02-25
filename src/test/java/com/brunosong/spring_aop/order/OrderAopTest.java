package com.brunosong.spring_aop.order;

import com.brunosong.spring_aop.order.aop.AspectV1;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Slf4j
@Import(AspectV1.class)
@SpringBootTest
public class OrderAopTest {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderService orderService;

    @Test
    void aopInfo() {

        log.info("orderRepository = {} ", AopUtils.isAopProxy(orderRepository));
        log.info("orderService = {} ", AopUtils.isAopProxy(orderService));

    }

    /* AOP 적용 */
    @Test
    void success() {
        orderService.orderItem("test");
    }


    @Test
    void fail() {
        Assertions.assertThatThrownBy( () -> orderService.orderItem("ex")
        ).isInstanceOf(IllegalStateException.class);

    }


}
