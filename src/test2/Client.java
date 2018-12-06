package test2;

public class Client {
    public static void main(String[] args) {
        Calc calc = new Calc();

        //调用运行时异常的方法
        /*double divide = calc.divide1(10, 0);
        System.out.println(divide);*/

        /*调用编译时异常，需要捕获*/
        /*try {
            double result = calc.divide2(10,0);
            System.out.println("result:" + result);
        } catch (MyArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("divide2方法执行结束");
        }*/

        //调用编译时异常的方法，不捕获，而是向外抛
        //double result = calc.divide2(10,0);
        //System.out.println("result:" + result);

        try {
            double calc1 = calc.calc("/", 10, 0);

        } catch (Calc.FuhaoException e) {
            System.out.println("元算符非法，请重新输入");
        } catch (MyArithmeticException e) {
            e.printStackTrace();
        }
    }
}
