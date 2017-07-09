package com.zwonb;

/**
 * 静态内部类
 * Created by zwonb on 2017/6/26.
 */
public class StaticInnerClass {
    int x = 100;
    static class Inner{
        void doitInner(){
//            System.out.println("外部类"+x); //静态内部类不能调用外部类的成员变量x
        }

        public static void main(String[] atrgs) {
            System.out.println("hello world");
        }
    }
}
