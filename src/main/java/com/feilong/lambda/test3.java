package com.feilong.lambda;

import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/**
 * @author 韩飞龙
 * @version 1.0
 */
public class test3 {
    public static void printNum(IntPredicate predicate){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            if(predicate.test(i)){
                System.out.println(i);
            } }
    }
    public static void main(String[] args) {
         printNum(new IntPredicate() {
             @Override
             public boolean test(int value) {
                 return value%2==0;
             }
         });

         printNum(value -> {return  value%2==0;});
    }
}
