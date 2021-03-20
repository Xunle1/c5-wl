import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xunle
 */
public class Task3 {
    int[] a = SortUtils.getRandomArray();
    int N = a.length;

    @Before
    public void printOrigin() {
        System.out.println("原数组：");
        for(int i = 0; i < N; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    @Test
    public void testBubbleSort() {

        for(int i = 0; i < N; i++) {
            for(int j = 1; j < N - i; j++) {
                if (a[j - 1] > a[j]) {
                    SortUtils.exchange(a,j,j-1);
                }
            }
        }

        System.out.println("冒泡排序后：");
        for(int i = 0; i < N; i++) {
            System.out.print(a[i] + ",");
        }
    }

    @Test
    public void testInsertionSort() {

        for(int i = 1; i < N; i++) {
           for(int j = i; j > 0; j--) {
               if (a[j] < a[j - 1]) {
                   SortUtils.exchange(a,j,j-1);
               }
           }
        }

        System.out.println("插入排序后：");
        for(int i = 0; i < N; i++) {
            System.out.print(a[i] + ",");
        }
    }

    @Test
    public void testQuickSort() {
        quickSort(a,0,a.length-1);

        System.out.println("快速排序后：");
        for(int i = 0; i < N; i++) {
            System.out.print(a[i] + ",");
        }
    }

    public void quickSort(int[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a,lo,hi);

        //左半部分a[lo..j]排序
        quickSort(a,lo,j);
        //右半部分a[j+1..hi]排序
        quickSort(a,j + 1,hi);
    }

    public int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        int v = a[lo];

        while (true) {
            //左右扫描指针
            while (a[++i] < v) if (i == hi) break;
            while (a[--j] > v) if (j == lo) break;
            if (i >= j) break;
            SortUtils.exchange(a,i,j);
        }
        //交换切分元素
        SortUtils.exchange(a,lo,j);
        return j;
    }

    public void mergeSort(int[] a,int lo, int hi) {

    }
}
