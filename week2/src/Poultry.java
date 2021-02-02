/**
 * @author Xunle
 * @data 2021/2/2 15:54
 */
public abstract class Poultry {
    private String name;
    private int age;
    private String symptom;
    private String illness;

    public Poultry() {
    }

    public Poultry(String name, int age, String symptom, String illness) {
        this.name = name;
        this.age = age;
        this.symptom = symptom;
        this.illness = illness;
    }

    protected abstract void showSymptom();

    public void showMsg() {
        System.out.println("动物种类：" + this.name + ",年龄：" + this.age);
        System.out.println("入院原因：" + this.illness);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public String getSymptom() {
        return symptom;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }
}
