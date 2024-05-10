package com.feilong.lambda;

/**
 * @author 韩飞龙
 * @version 1.0
 */
public class test1 {
    public static void main(String[] args) {
        new  Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("你知道吗 我比你想象的 更想在你身边");
            }
        }).start();
        //lambda写法

        new Thread(()->{
            System.out.println("6666");
        }).start();

    }
}
