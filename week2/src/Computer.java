import java.util.ArrayList;

/**
 *
 * @author Xunle
 * @date 2021/2/2 16:40
 */

public class Computer {
    private ArrayList<USB> usbs = new ArrayList<>();

    public Computer() {}

    protected void installUsbDrive(USB usb) {
        getUsbs().add(usb);
    }

    protected void start() {
        for (USB usb: usbs) {
            usb.start();
        }
        System.out.println("电脑启动！");
    }

    protected void close() {
        for (USB usb: usbs) {
            usb.close();
        }
        System.out.println("电脑关闭！");
    }

    public ArrayList<USB> getUsbs() {
        return usbs;
    }
}
