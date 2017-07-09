package com.zwonb;

/**
 * 成员内部类
 * Created by zwonb on 2017/6/25.
 */
public class OuterClass {

    InnerClass in = new InnerClass();
    public void ouf(){
        in.inf();
    }

    public InnerClass doit(){
//        y ==4; //外部类不可以直接访问内部类成员变量
        in.y = 4;
        return new InnerClass();
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        //内部类的对象实例化操作必须在外部类或者外部类的非静态方法中实现
        OuterClass.InnerClass in = out.doit();
        OuterClass.InnerClass in2 = out.new InnerClass();
        //这种方式是错误的--静态方法不能实例化非静态内部类
//        OuterClass.InnerClass in3 = new InnerClass();
    }

    class InnerClass{
        //构造方法
        public InnerClass() {
        }

        public void inf(){
        }

        int y = 0;
    }


}
