package com.zwonb;

import java.util.Random;

/**
 * final变量
 * Created by zwonb on 2017/6/25.
 */
public class FinalStaticData {

    private static Random random = new Random();
    private final int a1 = random.nextInt(10);
    private static final int a2 = random.nextInt(10);

    public static void main(String[] args) {
        FinalStaticData fdata = new FinalStaticData();
        System.out.println(fdata.a1);//定义了 final 的是每次运行程序值可变的
        System.out.println(fdata.a2); //定义了static final 的值是永恒不变的
        FinalStaticData fdata2 = new FinalStaticData();
        System.out.println(fdata2.a1);
        System.out.println(fdata2.a2);//定义了static final 的值是永恒不变的
    }
}
