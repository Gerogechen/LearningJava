package cn.chenzhuo9.code.chapter2;

/**
 *-Xoss参数（设置本地方法栈大小）
 * -Xss参数（设置栈容量）
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Exception e) {
            System.out.println("stack length: " + oom.stackLength);
            throw e;
        }
    }
}
