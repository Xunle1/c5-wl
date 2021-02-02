/**
 *
 * @author Xunle
 * @date 2021/2/2 16:12
 */

public abstract class B extends A{
    private final int numb = 20;

    public B() {}

    protected abstract void showB();

    public int getNumb() {
        return numb;
    }
}
