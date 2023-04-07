package HW_21_1;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        double num = in.nextDouble();

        Random random = new Random();
        int randNum = random.nextInt(21) - 10;
        try {
            if (randNum == 0) {
                throw new DivisionZeroException("Ошибка: случайное число равно нулю");
            }
            double quotient = num / randNum;

            if (quotient < 0) {
                throw new NegativeValueException("Ошибка: получено отрицательное частное");
            }
            System.out.println("Введенное число: " + num);
            System.out.println("Сгенерированное число: " + randNum);
            System.out.println("Частное чисел: " + quotient);
        } catch (DivisionZeroException e) {
            System.out.println(e.getMessage());
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
