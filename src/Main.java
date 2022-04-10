import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите имя и через пробел число разрядностью от 2 до 5, нажмите \"Enter\":");
        String value = scr.nextLine();
        nameSum(value);
    }

    private static void nameSum(String userValue) {
        int userNumb = 0;
        int sum = 0;
        String name = null;
        String[] value = userValue.split(" ");

        name = value[0];
        System.out.printf("Привет, %s! \nСумма цифр числа: ",name);

        userNumb = Integer.parseInt(value[1]);

        while (userNumb != 0){
            sum += (userNumb % 10);
            userNumb /= 10;
        }

        switch (sum){
            case 1:
                System.out.print("один.");
                break;
            case 2:
                System.out.print("два.");
                break;
            case 3:
                System.out.print("три.");
                break;
            case 4:
                System.out.print("четыре.");
                break;
            case 5:
                System.out.print("пять.");
                break;
            case 6:
                System.out.print("шесть.");
                break;
            case 7:
                System.out.print("семь.");
                break;
            case 8:
                System.out.print("восемь.");
                break;
            case 9:
                System.out.print("девять.");
                break;
            case 10:
                System.out.print("десять.");
                break;
            default:
                System.out.print("больше десяти!");
        }

    }
}
