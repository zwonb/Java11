package com.zwonb;

/**
 * 匿名内部类
 * Created by zwonb on 2017/6/26.
 */
public class OutClass4 {

    public OutInterface2 doit() {
        return new OutInterface2() { //声明匿名内部类
            private int i = 0;

            public int getValue() {
                return i;
            }
        };
    }
}
