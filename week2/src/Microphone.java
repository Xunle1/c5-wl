/**
 *
 * @author Xunle
 * @date 2021/2/2 16:39
 */

public class Microphone implements USB{
    private final String name = "Microphone";

    public Microphone() {}

    @Override
    public void start() {
        System.out.println("麦克风启动！");
    }

    @Override
    public void close() {
        System.out.println("麦克风关闭！");
    }

    public String getName() {
        return name;
    }
}
