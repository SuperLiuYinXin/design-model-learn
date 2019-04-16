/**
 * @Author: liuyinxin
 * @Date: 2019-04-16
 * @Time: 00:29
 * do the best
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
