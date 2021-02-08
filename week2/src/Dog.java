/**
 *
 * @author Xunle
 * @date 2021/2/8 19:08
 */

public class Dog implements Pet{
    private String name;
    private int age;

    public Dog() {}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "狗的姓名：" + this.name + "，年龄：" + this.age;
    }
}
