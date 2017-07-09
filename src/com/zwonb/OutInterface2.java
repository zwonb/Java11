package com.zwonb;

/**
 * 局部内部类
 * Created by zwonb on 2017/6/26.
 */
interface OutInterface2 {
}

class OuterClass3 {
    //外部类不能访问局部内部类
private int x;
    public OutInterface2 doit(final String x) {

        //在doit（）方法中定义一个内部类
        class InnerClass2 implements OutInterface2 {
            InnerClass2(String s) {
                s = x;
                System.out.println(s);
            }
        }

        return new InnerClass2("doit");
    }
}
