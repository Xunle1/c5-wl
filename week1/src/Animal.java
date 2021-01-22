/**
 * @author Xunle
 * @date 2021/1/22 22:29
 */
public class Animal {
    private String species;
    private int height;
    private int weight;

    public Animal(){}

    public Animal(String species, int height, int weight){
        this.species = species;
        this.height = height;
        this.weight = weight;
    }
    public void eat() {
        System.out.println("动物要吃东西！");
    }

    public void sleep() {
        System.out.println("动物要睡觉！");
    }

    @Override
    public String toString() {
        return this.species + ":height=" + height + "cm, " + "weight=" + weight + "kg";
    }
}
