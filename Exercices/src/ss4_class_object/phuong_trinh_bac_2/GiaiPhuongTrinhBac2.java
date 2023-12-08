package ss4_class_object.phuong_trinh_bac_2;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Phương trình bậc 2 có dạng :  aX^2 + bX + c = 0 \n" +
                "Mời bạn nhập hệ số a, b, c. a khác 0");
        double a = checkA();
        System.out.println("Nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c: ");
        double c = Double.parseDouble(scanner.nextLine());
        System.out.println("Phương trình bạn vừa nhập là : " + a + "X^2+" + b + "X+" + c + "=0");
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm X1 = X2 = :" + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt X1, X2 ");
            System.out.println("X1: " + quadraticEquation.getRoot1());
            System.out.println("X2: " + quadraticEquation.getRoot2());
        }
    }

    public static double checkA() {
        System.out.println("Nhập a:");
        double a = Double.parseDouble(scanner.nextLine());
        while (true) {
            if (a != 0) {
                return a;
            } else {
                System.out.println("hệ số a phải khác 0, nhập lại a :");
                a = Double.parseDouble(scanner.nextLine());
            }
        }
    }
}