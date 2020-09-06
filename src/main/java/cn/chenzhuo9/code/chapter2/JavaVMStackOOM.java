package cn.chenzhuo9.code.chapter2;

/**
 * 创建线程导致内存溢出异常
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true) {

        }
    }
    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(() -> dontStop());
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}

