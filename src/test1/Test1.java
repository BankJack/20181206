package test1;

public class Test1 {
    /**
     * 打印异常信息
     * 根据栈先进后出的原理
     * 查看异常信息时，通常看第二行能够知道导致异常的代码位置
     * @param args
     */
    public static void main(String[] args) {
       test1();
    }

    public static void test1(){
        test2();
    }

    public static void test2(){
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[5]);
    }
}
