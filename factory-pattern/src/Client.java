/**
 * 调用代码
 * @author: liuyinxin-896400010@qq.com
 * @date: 2019-04-16
 * @time: 23:31
 * do the best
 */
public class Client {

    public static void main(String[] args) {

//        通过工厂来创建代码,解耦合
        // 不过这个只是简单工厂模式
        Operation add = EasyFactory.createOperation('+');
        Operation sub = EasyFactory.createOperation('-');
        Operation mul = EasyFactory.createOperation('*');
        Operation div = EasyFactory.createOperation('/');
        System.out.println(add.getResult(1, 2));
        System.out.println(sub.getResult(3, 2));
        System.out.println(mul.getResult(3, 2));
        System.out.println(div.getResult(6, 2));
    }
}
