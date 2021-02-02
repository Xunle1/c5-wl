/**
 *
 * @author Xunle
 * @date 2021/2/2 15:59
 */

public class Duck extends Poultry {
    public Duck() {
    }

    public Duck(int age, String symptom, String illness) {
        super("鸭子", age, symptom, illness);
    }


    @Override
    protected void showSymptom() {
        System.out.println("症状为：" + getSymptom());
    }

}
