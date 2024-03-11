import java.util.Scanner;
import java.lang.Math;

public class Ex226 {

    static void Solve_first_degree (int A, int B) {
        if (A == 0) {
            if (B == 0)
                System.out.println("Phuong trinh vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        }
        else 
            System.out.println("Nghiem cua phuong trinh la: " + -B/A);
    }

    static void Solve_system_first_degree (int D, int Dx, int Dy) {
        if (D != 0) {
            System.out.printf("He co 1 nghiem duy nhat (%d; %d)", Dx/D, Dy/D);
        }
        else {
            if (Dx == 0 && Dy == 0)
            {
                System.out.println("He co vo so nghiem");
            }
            else 
                System.out.println("He vo nghiem");
        }
    }
    static void second_degree_equation(int a, int b, int c) {
        if (a == 0)
            Solve_first_degree(b, c);
        else {
            double delta = b*b - 4*a*c;
            if (delta == 0) {
                double sol = -b/(2*a);
                System.out.println("Phuong trinh co 1 nghiem kep " + sol);
            }
            else if (delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else {
                double sol1 = (-b + Math.sqrt(delta))/(4*a);
                double sol2 = (-b - Math.sqrt(delta))/(4*a);
                System.out.printf("Phuong trinh co 2 nghiem la %.2f va %.2f", sol1, sol2);
            }
        }
    }
    public static void main(String[] args) {
    
        int[][] a = new int[10][19];
        int A, B;
        Scanner input = new Scanner(System.in);

        System.out.println("Giai phuong trinh bac nhat Ax + B = 0\n A =");
        A = input.nextInt();
        System.out.println("B =");
        B = input.nextInt();

        Solve_first_degree(A, B);

        System.out.println("Giai he phuong trinh bac nhat 2 an . Nhap vao ma tran he so");
        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j <= 3; ++j) {
                a[i][j] = input.nextInt();
            }
        }
       int D = a[1][1]*a[2][2] - a[1][2]*a[2][1];
       int Dx = a[1][3]*a[2][2] - a[2][3]*a[1][2];
       int Dy = a[1][1]*a[2][3] - a[2][1]*a[1][3];

       Solve_system_first_degree(D, Dx, Dy);
        

        System.out.println("Giai tam tuc bac 2 ax^2 +bx + c = 0");
        int x, y, z;
        System.out.println("Nhap a = ");
        x = input.nextInt();
        System.out.println("Nhap b = ");
        y = input.nextInt();
        System.out.println("Nhap c = ");
        z = input.nextInt();
       second_degree_equation(x, y, z);

    }
}
