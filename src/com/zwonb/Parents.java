package com.zwonb;

/**
 * Created by zwonb on 2017/6/25.
 */
public class Parents {

    private final void doit() {
        System.out.println("父类.doit()");
    }

    final void doit2() {
        System.out.println("父类.doit2()");
    }

    public void doit3() {
        System.out.println("父类.doit3()");
    }
}

class Sub extends Parents {

    public final void doit() {
        System.out.println("子类.doit()");
    }

    //final方法不能重写
//    final void doit2(){
//    }

    @Override
    public void doit3() {
        System.out.println("子类.doit3()");
    }
}

class FinalMethod {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.doit();
        Parents p = s; //向上转型
//        p.doit(); //不能调用private方法
        p.doit2();
        p.doit3();
    }
}
