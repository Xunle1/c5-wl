import java.util.Scanner;

/**
 * @author Xunle
 * @date 2021/1/22 21:51
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int real,imaginary;
        System.out.println("请输入复数1");
        real = in.nextInt();
        imaginary = in.nextInt();
        ComplexNumber complexNumber1 = new ComplexNumber(real, imaginary);
        System.out.println("请输入复数2");
        real = in.nextInt();
        imaginary = in.nextInt();
        ComplexNumber complexNumber2 = new ComplexNumber(real, imaginary);
        System.out.println("两复数相加为：" + complexNumber1.add(complexNumber2));
        System.out.println("两复数相减为：" + complexNumber1.reduce(complexNumber2));
        System.out.println("两复数相乘为：" + complexNumber1.multiply(complexNumber2));
    }

    static class ComplexNumber {
        int real;
        int imaginary;

        public ComplexNumber(){}

        public ComplexNumber(int real, int imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public String add(ComplexNumber other) {
            int real = this.real + other.real;
            int imaginary = this.imaginary + other.imaginary;
            if (this.imaginary + other.imaginary == 0) {
                return "" + real;
            }
            else if (imaginary == 1){
                return this.real + other.real + "+i";
            } else {
                return real + "+" + imaginary + "i";
            }
        }

        public String reduce(ComplexNumber other) {
            int real = this.real - other.real;
            int imaginary = this.imaginary - other.imaginary;
            if (imaginary == 0) {
                return "" + real;
            }
            else if (imaginary == 1){
                return real + "+i";
            } else {
                return real + "+" + imaginary + "i";
            }
        }

        public String multiply(ComplexNumber other) {
            int real = (this.real * other.real - this.imaginary * other.imaginary);
            int imaginary = (this.real * other.imaginary + this.imaginary * other.real);
            if (imaginary == 0) {
                return "" + real;
            } else if (imaginary == 1) {
                return real + "+i";
            } else {
                return real + "+" + imaginary + "i";
            }
        }
    }
}
