/**
 * 简单工厂模式
 * @author: liuyinxin-896400010@qq.com
 * @date: 2019-04-16
 * @time: 23:29
 * do the best
 */
public class EasyFactory {

    public static Operation createOperation(char operation){
        Operation o = null;
        switch (operation) {
            case '+':
                o = new Add();
                break;
            case '-':
                o = new Sub();
                break;
            case '*':
                o = new Mul();
                break;
            case '/':
                o = new Div();
                break;
            default:break;
        }
        return o;
    }
}
