import javax.swing.text.html.StyleSheet;

/**
 * @Author: liuyinxin
 * @Date: 2019-04-16
 * @Time: 00:30
 * do the best
 */
public class ClassAdapterTest {

    public static void main(String[] args) {

        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
