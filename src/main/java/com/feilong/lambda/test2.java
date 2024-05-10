package com.feilong.lambda;

import java.util.function.IntBinaryOperator;

/**
 * @author 韩飞龙
 * @version 1.0
 */
public class test2 {
    public static int calculateNum(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }
    public static void main(String[] args) {
            int i = calculateNum(new IntBinaryOperator() {
                @Override
                public int applyAsInt(int left, int right) {
                    return left+right;
                }
            });

            int j = calculateNum(((left, right) -> {return left+right;}));
    }
}
