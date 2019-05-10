package com.handl.demo;

public class JingTaiFenPai {

    static void uu(A a){
        a.mi();
        System.out.println("A");
    }

    //验证后，参数B和C方法是没有用的，原因是，静态分派只看静态类型，然后在调用方法时(mi方法)才看实际类型
    static void uu(B a){
        a.mi();
        System.out.println("B");
    }
    static void uu(C a){
        a.mi();
        System.out.println("C");
    }

    /**
     * 静态分派，方法在调用时，形参的类型是通过判定静态类型来区分的，
     * 只有形参在实际使用时，才使用实际类型
     * 因为a,b,c都是类型A的静态类型，所以调用方法时，都会寻找形参为A类型的方法，
     * 在方法内部使用形参时，才真的使用了形参的实际类型
     * @param args
     */
    public static void main(String[] args) {
        A a = new A();
        A b = new B();
        A c = new C();
        JingTaiFenPai.uu(a);
        JingTaiFenPai.uu(b);
        JingTaiFenPai.uu(c);
    }
}


class A{
    void  mi(){
        System.out.println("aa");
    }
}

class B extends A{
    void  mi(){
        System.out.println("bb");
    }
}

class C extends A{
    void  mi(){
        System.out.println("cc");
    }
}