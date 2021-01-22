/**
 * @author Xunle
 * @date 2021/1/22 22:40
 */
public class Tiger extends Animal{

    public Tiger(){}

    public Tiger(int height, int weight){
        super("Tiger", height, weight);
    }

    @Override
    public void eat() {
        System.out.println("老虎吃肉！");
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
