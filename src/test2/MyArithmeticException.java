package test2;

/**
 * 自定义的一个数学算术编译时异常
 */
public class MyArithmeticException extends Exception{
    public MyArithmeticException() {
        super();
    }

    public MyArithmeticException(String message) {
        super(message);
    }
}
