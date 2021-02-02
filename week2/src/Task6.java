/**
 *
 * @author Xunle
 * @data 2021/2/2 15:21
 */
public class Task6 {
    public static void main(String[] args) {
        Car car1 = new Car(3);
        System.out.println("--------------------------");
        Truck truck1 = new Truck(1, 3000);
        System.out.println("--------------------------");
        Car car2 = new Car(6);
        System.out.println("--------------------------");
        Truck truck2 = new Truck(1, 70000);
    }

    /**
     * 设计一个汽车类 Vehicle，包含的属性有车轮个数 wheels 和车重 weight
     */
    static class Vehicle {
        private int wheels;
        private int weight;

        public Vehicle() {
        }

        public Vehicle(int wheels, int weight) {
            this.wheels = wheels;
            this.weight = weight;
            System.out.println("车轮的数量是：" + this.wheels + "  车重：" + this.weight);
        }
    }

    /**
     * 小车类 Car 是 Vehicle 的子类，其中包含的属性有载人数 loader
     */
    static class Car extends Vehicle {
        private int loader;
        public Car(int loader) {
            super(4, 1150);
            this.loader = loader;
            System.out.print("这是一辆小车，核载5人，实载" + this.loader + "人");
            if (this.loader > 5) {
                System.out.println("，你超员了！！！");
            } else {
                System.out.println();
            }
        }
    }

    /**
     * 卡车类 Truck 也是 Vehicle 的子类，其中包含的属性有载人数 loader 和载重量 payload
     */
    static class Truck extends Vehicle {
        private int loader;
        private int payload;

        public Truck() {}

        public Truck(int loader, int payload) {
            super(6, 15000);
            this.loader = loader;
            this.payload = payload;

            System.out.print("这是一辆卡车，核载3人，实载" + this.loader + "人");
            if (this.loader > 3) {
                System.out.println("，你超员了！！！");
            } else {
                System.out.println();
            }

            System.out.print("这是一辆卡车，核载5000kg, 实载" + this.payload + "kg");
            if (this.payload > 5000) {
                System.out.println("，你超载了！！！");
            }
        }
    }
}
