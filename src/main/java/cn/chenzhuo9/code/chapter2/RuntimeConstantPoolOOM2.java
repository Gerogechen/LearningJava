package cn.chenzhuo9.code.chapter2;

/**
 * 字符串在执行StringBuilder.toString之前就已经出现过了，字符串常量池已经有它的引用
 */
public class RuntimeConstantPoolOOM2 {
    public static void main(String[] args) {
        String s1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern() == s2);
    }
}
