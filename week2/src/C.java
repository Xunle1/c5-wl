/**
 *
 * @author Xunle
 * @date 2021/2/2 16:14
 */

public class C extends B{
    private int numc = 30;

    public C() {}

    @Override
    protected void showA() {
        System.out.println("A类中numa：" + getNuma());
    }

    @Override
    protected void showB() {
        System.out.println("B类中numb：" + getNumb());
    }

    protected void showC() {
        System.out.println("C类中numc：" + getNumc());
    }

    public int getNumc() {
        return numc;
    }
}
