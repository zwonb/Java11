package com.zwonb;

/**
 * Created by zwonb on 2017/6/25.
 */
final class FinalClass {

    int a = 3;

    void doit() {
    }

    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.a++;
        System.out.println(f.a);
    }
}
