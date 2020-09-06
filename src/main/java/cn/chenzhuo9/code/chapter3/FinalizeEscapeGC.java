package cn.chenzhuo9.code.chapter3;

/**
 * 1 对象在GC时自我拯救
 * 2 这种自救机会只有1次，因为一个对象的finalize()方法最多只会被系统自动调用一次
 * @author: chenzzzz
 * @date: 2020/9/6
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("yes, i am still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();

        //one alive
        SAVE_HOOK = null;
        System.gc();

        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no, i am dead:(");
        }
        //one alive
        SAVE_HOOK = null;
        System.gc();

        Thread.sleep(500);
        if (SAVE_HOOK != null) {
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no, i am dead:(");
        }
    }
}
