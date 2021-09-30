package com.example.demo.patterns.creational.Builder;

import org.junit.jupiter.api.Test;

public class MainBuilderTests {
    @Test
    public void testStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is an example ");
        stringBuilder.append("of the builder pattern.");
        stringBuilder.append("I has methods to append ");
        stringBuilder.append("almost anything we want to a String.");
        stringBuilder.append(42);
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void testLunchOrderBean() {

        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }

    @Test
    public void testLunchOrderBeanTelescopingConstructor() {

        LunchOrderBeanTelescopingConstructor lunchOrderBeanTelescopingConstructor
                = new LunchOrderBeanTelescopingConstructor(
                "Wheat",
                "Lettuce",
                "Mustard",
                "Ham");

        System.out.println(
                lunchOrderBeanTelescopingConstructor.getBread());
        System.out.println(
                lunchOrderBeanTelescopingConstructor.getCondiments());
        System.out.println(
                lunchOrderBeanTelescopingConstructor.getDressing());
        System.out.println(
                lunchOrderBeanTelescopingConstructor.getMeat());
    }

    @Test
    public void testLunchOrder() {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bead("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
        LunchOrder lunchOrder = builder.build();
        System.out.println(
                lunchOrder.getBread());
        System.out.println(
                lunchOrder.getCondiments());
        System.out.println(
                lunchOrder.getDressing());
        System.out.println(
                lunchOrder.getMeat());
    }

}
