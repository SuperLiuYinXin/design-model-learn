/**
 * 除法类
 * @author: liuyinxin-896400010@qq.com
 * @date: 2019-04-16
 * @time: 23:29
 * do the best
 */
public class Div implements Operation{

    @Override
    public double getResult(double a, double b) {
        if (b == 0)
            throw new ArithmeticException("div could not be null");
        return a / b;
    }
}
