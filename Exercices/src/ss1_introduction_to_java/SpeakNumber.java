import java.util.Scanner;

public class SpeakNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Number: ");
        String valueOnes = "";
        String valueTens = "";
        String valueHundreds = "Hundred";
        int number = Integer.parseInt(scanner.nextLine());
        int one = 0;
        int ten = 0;
        int hundred = 0;
        if (number < 0 || number >= 1000) {
            System.out.println("out of ability");
        } else if (number == 0) {
            System.out.println("Zero");
        } else if (number < 100) {
            one = number % 10;
            ten = number / 10;
        } else {
            hundred = number / 100;
            one = (number % 100) % 10;
            ten = (number % 100) / 10;
        }
        switch (one) {
            case 1:
                valueOnes = "One";
                break;
            case 2:
                valueOnes = "Two";
                break;
            case 3:
                valueOnes = "Three";
                break;
            case 4:
                valueOnes = "Four";
                break;
            case 5:
                valueOnes = "Five";
                break;
            case 6:
                valueOnes = "Six";
                break;
            case 7:
                valueOnes = "Seven";
                break;
            case 8:
                valueOnes = "Eight";
                break;
            case 9:
                valueOnes = "Nine";
                break;
        }
        switch (ten) {
            case 1:
                switch (one) {
                    case 0:
                        valueOnes = "Ten";
                        break;
                    case 1:
                        valueOnes = "Eleven";
                        break;
                    case 2:
                        valueOnes = "Twelve";
                        break;
                    case 3:
                        valueOnes = "Thirteen";
                        break;
                    case 4:
                        valueOnes = "Fourteen";
                        break;
                    case 5:
                        valueOnes = "Fifteen";
                        break;
                    case 6:
                        valueOnes = "Sixteen";
                        break;
                    case 7:
                        valueOnes = "Seventeen";
                        break;
                    case 8:
                        valueOnes = "Eighteen";
                        break;
                    case 9:
                        valueOnes = "Nineteen";
                        break;
                }
                break;
            case 2:
                valueTens = "Twenty";
                break;
            case 3:
                valueTens = "Thirty";
                break;
            case 4:
                valueTens = "Forty";
                break;
            case 5:
                valueTens = "Fifty";
                break;
            case 6:
                valueTens = "Sixty";
                break;
            case 7:
                valueTens = "Seventy";
                break;
            case 8:
                valueTens = "Eighty";
                break;
            case 9:
                valueTens = "Ninety";
                break;
        }
        switch (hundred) {
            case 1:
                valueHundreds = "One " + valueHundreds;
                break;
            case 2:
                valueHundreds = "Two " + valueHundreds;
                break;
            case 3:
                valueHundreds = "Three " + valueHundreds;
                break;
            case 4:
                valueHundreds = "Four " + valueHundreds;
                break;
            case 5:
                valueHundreds = "Five " + valueHundreds;
                break;
            case 6:
                valueHundreds = "Six " + valueHundreds;
                break;
            case 7:
                valueHundreds = "Seven " + valueHundreds;
                break;
            case 8:
                valueHundreds = "Eight " + valueHundreds;
                break;
            case 9:
                valueHundreds = "Nine " + valueHundreds;
                break;
        }
        if (!(one == 0 && ten == 0)) {
            valueHundreds = valueHundreds + " and ";
        }
        if (number < 20) {
            System.out.println(valueOnes);
        } else if (number < 100) {
            System.out.println(valueTens + " " + valueOnes);
        } else if (number < 1000) {
            System.out.println(valueHundreds + valueTens + " " + valueOnes);
        }
    }
}

