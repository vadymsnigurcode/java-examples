package com.example.demo.springSamples;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= com.example.demo.springSamples.ContextConfiguration.class)
public class SpringConfigurationTests {

    @Autowired
    private OrderService orderService;

    @Test
    public void testOrderService() {
        Assert.assertEquals(5,orderService.sum(2,3));
    }

}
