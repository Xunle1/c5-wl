/**
 *
 * @author Xunle
 * @date 2021/2/2 16:23
 */

public class Sun extends Star implements Universe{
    public Sun() {}

    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }

    @Override
    protected void shine() {
        System.out.println("sun:光照八分钟，到达地球");
    }
}
