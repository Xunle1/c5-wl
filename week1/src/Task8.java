/**
 * @author Xunle
 * @date 2021/1/22 22:36
 */
public class Task8 {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(20, 3);
        Tiger tiger = new Tiger(50, 30);
        rabbit.eat();
        rabbit.sleep();
        tiger.eat();
        tiger.sleep();
        System.out.println(rabbit);
        System.out.println(tiger);
    }
}
