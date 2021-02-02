/**
 *
 * @author Xunle
 * @date 2021/2/2 15:16
 */
public class Task5 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.speak();

        People people = new People();
        people.speak();
        people.think();
    }

    static class Monkey {
        public Monkey() {}

        public Monkey(String s) {

        }

        public void speak() {
            System.out.println("咿咿呀呀......");
        }
    }

    static class People extends Monkey{
        public People() {}

        @Override
        public void speak() {
            System.out.println("小样的，不错嘛！会说话了！");
        }

        public void think() {
            System.out.println("别说话！认真思考！");
        }
    }
}
