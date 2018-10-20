package cn.chenzhuo9.thinkingInJava.chapter7;

public class C extends A{
    B b = new B();

    public static void main(String[] args) {
        C c = new C();
    }
}
class A{
    A(){
        System.out.println("A");
    }
}
class B{
    B(){
        System.out.println("B");
    }
}