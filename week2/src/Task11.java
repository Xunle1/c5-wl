import java.util.ArrayList;

/**
 * 宠物商店
 * @author Xunle
 * @date 2021/2/8 19:14
 */

public class Task11 {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        shop.add(new Cat("波斯猫", 9));
        shop.add(new Cat("波米拉猫", 10));
        shop.add(new Cat("暹罗猫", 5));
        shop.add(new Dog("金毛", 3));
        shop.add(new Dog("德牧", 5));
        shop.add(new Dog("细犬", 2));
        ArrayList<Pet> list = new ArrayList<>();
        list = shop.search("波");

        System.out.println("查询结果是：");
        for(Pet pet:list) {
            System.out.println(pet);
        }
    }
}
