/**
 *
 * @author Xunle
 * @date 2021/2/2 16:52
 */

public class Task10 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.installUsbDrive(new Mouse());
        computer.installUsbDrive(new Microphone());
        computer.installUsbDrive(new Keyboard());

        computer.start();
        System.out.println("-------------------------");
        computer.close();
    }
}
