package HW_18;


import java.util.Scanner;

public class Recurs {
    public static void main(String[] args) {
        Scanner inDig = new Scanner(System.in);
        System.out.println("Введите число побольше");
        int number = inDig.nextInt();
        System.out.println(reverseDigits(number));
    }

    public static String reverseDigits(int number) {
        if (number < 10) {
            return number + "" + number + " ";
        }
        int lastDigit = number % 10;
        return lastDigit + "" + lastDigit + " " + reverseDigits(number / 10);
    }
}






