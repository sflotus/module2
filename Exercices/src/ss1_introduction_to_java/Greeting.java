import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello: "+name);
    }
}
