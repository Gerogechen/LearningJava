package cn.chenzhuo9.thinkingInJava.chapter7;

public class Detergent extends Cleanser {
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(".foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);

    }

}

class test extends Detergent {
    public void scrub() {
        System.out.println("sssssss");
    }

    public void sterilize() {
        System.out.println("aaaaaa");
    }

    public static void main(String[] args) {
        test t = new test();
        t.scrub();
        t.sterilize();
    }
}

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(".dilute()");
    }

    public void apply() {
        append(".apply()");
    }

    public void scrub() {
        append(".scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}
