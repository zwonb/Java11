package com.zwonb;

/**
 * 内部类向上转型为接口
 * Created by zwonb on 2017/6/25.
 */
public interface OuterInterface {
    void f();
}

class InterfaceInner{
    public static void main(String[] args){
        OuterClass2 out = new OuterClass2();
        OuterInterface outinter = out.doit();
        outinter.f();
    }
}

class OuterClass2{

    //私有的内部类向上转型为接口，提供给外部类使用
    private class InnerClass implements OuterInterface{

        public InnerClass(String s) {
            System.out.println(s);
        }

        @Override
        public void f() {
            System.out.println("访问内部类中的f()方法");
        }

    }

    public OuterInterface doit(){
        return new InnerClass("访问内部类构造方法");
    }

}