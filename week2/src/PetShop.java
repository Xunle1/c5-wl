import java.util.ArrayList;

/**
 *
 * @author Xunle
 * @date 2021/2/2 19:00
 */

public class PetShop {
    private ArrayList<Pet> shop = new ArrayList<>();
    public PetShop() {}

    public void add(Pet pet) {
        this.shop.add(pet);
    }

    public void delete(Pet pet) {
        this.shop.remove(pet);
    }

    public ArrayList search(String key) {
        ArrayList<Pet> result = new ArrayList<>();

        for(Pet pet:shop) {
            if (pet.getName().contains(key)) {
                result.add(pet);
            }
        }

        return result;
    }
}
