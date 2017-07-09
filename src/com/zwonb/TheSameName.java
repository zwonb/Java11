package com.zwonb;

/**
 * 外部类 内部类变量名相同 可以使用 外部类名.this.变量名 使用外部类变量
 * Created by zwonb on 2017/6/26.
 */
public class TheSameName {

    private int x;

    private class Inner{
        private int x = 9;

        public void doit(int x){
            x++; //调用的是形参x
            this.x++; //调用内部类的变量x
            TheSameName.this.x++; //调用外部类的变量x
        }

    }
}
