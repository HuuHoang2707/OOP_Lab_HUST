import java.util.Scanner;
import java.lang.Math;

public class Ex225 {

    static double a, b;
    static double sum2(double x, double y) {
        return x + y;
    }

    static double diff2(double x, double y) {
        return Math.abs(x - y);
    }

    static double product(double x, double y) {
        return x * y;
    }

    static double quotient(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        a = myobj.nextDouble();
        b = myobj.nextDouble();
        
        System.out.println("Tong cua 2 so " + a + " va " + b + " la " + sum2(b, a)+"\n");
        System.out.println("Hieu cua 2 so " + a + " va " + b + " la " + diff2(b, a)+"\n");
        System.out.println("Tich cua 2 so " + a + " va " + b + " la " + product(b, a)+"\n");
        System.out.println("Tong cua 2 so " + a + " va " + b + " la " + quotient(b, a)+"\n");
    }
    
    
}
