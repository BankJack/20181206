package test2;

public class Calc {

    /**
     * 方法内部抛出运行时异常
     * 因此不需要显式的捕获异常
     * @param a
     * @param b
     * @return
     */
    public double divide1(double a,double b){
        if (b == 0) {
           //抛出异常
            throw new ArithmeticException("除数不能为0");
        }
        return a / b;
    }

    /**
     * 抛出自定义的MyArithmeticException
     * 在抛出编译时异常时，必须在方法声明中throws异常的类型
     * @param a
     * @param b
     * @return
     */
    public double divide2(double a,double b) throws MyArithmeticException {
        if (b == 0) {
            //抛出自定义异常
            throw new MyArithmeticException("除数不能为0!");
        }
        return a / b;
    }

    public double calc(String fuhao,double a,double b) throws FuhaoException, MyArithmeticException {
        if (!isaFuhao(fuhao)){ //判断符号是否为+，-，*，/
            throw new FuhaoException("非法的运算符！");
        }
        if (b == 0 && fuhao.equals("/")){
            throw new MyArithmeticException("除数不能为0！");
        }
        return a / b;
    }

    private boolean isaFuhao(String fuhao) {
        return fuhao.equals("+")||fuhao.equals("-")||fuhao.equals("*")||fuhao.equals("/");
    }

    public static class FuhaoException extends Exception{
        public FuhaoException() {
            super();
        }

        public FuhaoException(String message) {
            super(message);
        }
    }
}
