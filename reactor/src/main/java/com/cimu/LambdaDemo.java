package com.cimu;

/**
 * @author: zhengmao_chai
 * @date: 2021/5/17$ 9:43$
 * @since: 1.0.0
 */
public class LambdaDemo {

    public static void main(String[] args) {
        new Thread(() -> test(args)).start();
    }

    private static void test(String[] args) {
        System.out.println("LambdaDemo.test");
    }

}
