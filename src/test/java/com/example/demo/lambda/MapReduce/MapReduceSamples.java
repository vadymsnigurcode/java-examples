package com.example.demo.lambda.MapReduce;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class MapReduceSamples {
    @Test
    public void testMapReduce() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> i1+i2;

        int reduction = reduce(ints, 0, op);

        System.out.println("Reduction : " + reduction);
    }

    @Test
    public void testMapReduceTwoListsReduce() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> i1+i2;

        //int reduction = reduce(ints, 0, op);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);

        System.out.println("Reduction : " + reduction);
    }

    @Test
    public void testMapReduceTwoListsReduceMax() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> Integer.max(i1,i2);

        //int reduction = reduce(ints, 0, op);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);

        System.out.println("Reduction : " + reduction);
    }

    @Test
    public void testMapReduceNoneAssociativeOperation01() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> (i1+i2)*(i1+i2);

        //int reduction = reduce(ints, 0, op);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        //int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);
        int reduction = reduce(ints,0,op);

        System.out.println("Reduction : " + reduction);
    }

    @Test
    public void testMapReduceNoneAssociativeOperation02() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> (i1+i2)*(i1+i2);

        //int reduction = reduce(ints, 0, op);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);
        //int reduction = reduce(ints,0,op);

        System.out.println("Reduction : " + reduction);
    }

    @Test
    public void testMapReduceNoneAssociativeOperation03() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> (i1+i2)/2;

        //int reduction = reduce(ints, 0, op);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        //int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);
        int reduction = reduce(ints,0,op);

        System.out.println("Reduction : " + reduction);
    }

    @Test
    public void testMapReduceNoneAssociativeOperation04() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> (i1+i2)/2;

        //int reduction = reduce(ints, 0, op);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);
        //int reduction = reduce(ints,0,op);

        System.out.println("Reduction : " + reduction);
    }

    @Test
    public void testMapReduceOperation02() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> i1;

        //int reduction = reduce(ints, 0, op);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        //int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);
        int reduction = reduce(ints,0,op);

        System.out.println("Reduction : " + reduction);
    }

    @Test
    public void testMapReduceOperation03() {
        List<Integer> ints = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> ints1 = Arrays.asList(0,1,2,3,4);
        List<Integer> ints2 = Arrays.asList(5,6,7,8,9);

        BinaryOperator<Integer> op = (i1, i2) -> i1;

        //int reduction = reduce(ints, 0, op);

        int reduction1 = reduce(ints1, 0, op);
        int reduction2 = reduce(ints2, 0, op);
        int reduction = reduce(Arrays.asList(reduction1,reduction2), 0, op);
        //int reduction = reduce(ints,0,op);

        System.out.println("Reduction : " + reduction);
    }

    private static int reduce(
            List<Integer> values,
            int valueIfEmpty,
            BinaryOperator<Integer> reduction) {
        int result = valueIfEmpty;
        for (int value : values ) {
            result = reduction.apply(result, value);
        }
        return result;
    }
}
