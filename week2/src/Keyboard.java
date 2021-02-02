/**
 *
 * @author Xunle
 * @date 2021/2/2 16:37
 */

public class Keyboard implements USB{
    private final String name = "Keyboard";

    public Keyboard() {}

    @Override
    public void start() {
        System.out.println("键盘启动！");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭！");
    }

    public String getName() {
        return name;
    }
}
