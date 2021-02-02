/**
 *
 * @author Xunle
 * @date 2021/2/2 16:38
 */

public class Mouse implements USB{
    private final String name = "Mouse";

    public Mouse() {}

    @Override
    public void start() {
        System.out.println("鼠标启动！");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭！");
    }

    public String getName() {
        return name;
    }
}
