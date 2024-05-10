package com.feilong.lambda;

import java.util.function.Function;
import java.util.function.IntPredicate;

/**
 * @author 韩飞龙
 * @version 1.0
 */
public class test4 {
    //生命是泛型方法，返回泛型类型
    public static <R> R typeConver(Function<String,R> function){
        String str = "1235";
        R result = function.apply(str);
        return result;
    }

    public static void main(String[] args) {
        Integer i = typeConver(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        });
        Integer i1 = typeConver((String s) -> {
            return Integer.valueOf(s);
        });
    }
}
