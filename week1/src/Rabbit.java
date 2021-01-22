/**
 * @author Xunle
 * @date 2021/1/22 22:37
 */
public class Rabbit extends Animal{

    public Rabbit(){}

    public Rabbit(int height, int weight){
        super("Rabbit", height, weight);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃草！");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
