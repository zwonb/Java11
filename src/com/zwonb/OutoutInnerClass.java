package com.zwonb;

/**
 * 内部类的继承
 * Created by zwonb on 2017/6/26.
 */
public class OutoutInnerClass extends ClassA.ClassB { //继承内部类ClassB

    /**
     * 必须给这个类一个带参数的构造方法，并且参数为需要继承内部类的外部类的引用
     */
    public OutoutInnerClass(ClassA a) {
        a.super();
    }
}

class ClassA{
    class ClassB {

    }
}
