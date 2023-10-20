import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tỷ giá");
        int exchangeRate = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số tiền muốn quy đổi");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.println("Số tiền sau quy đổi: "+exchangeRate*money+"VND");
    }
}
