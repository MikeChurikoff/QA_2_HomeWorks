package HW_17;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_HW17 {
    public static void main(String[] args) {


      /*  String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        Scanner input = new Scanner(System.in);
        System.out.print("Введите индекс имени (от 0 до 6): ");
        int nameIndex = input.nextInt();
        System.out.print("Введите индекс времени (от 0 до 5): ");
        int timeIndex = input.nextInt();
        System.out.print("Введите индекс места (от 0 до 5): ");
        int placeIndex = input.nextInt();
        String name = names[nameIndex];
        int time = times[timeIndex];
        String place = places[placeIndex];
        System.out.printf("%s будет идти в %s в %d:00", name, place, time);

*/


       /* int[] array = {2, 5, 7, 12, 37, 16, 4, 22, 77, 9};
        Scanner intNumber = new Scanner(System.in);
        System.out.println("Введите проверочное число");
                int number = intNumber.nextInt();
                boolean checkNum = false;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == number) {
                        checkNum = true;
                        break;
                    }
                }
                if (checkNum) {
                    System.out.println("Число " + number + " присутствует");
                } else {
                    System.out.println("А вот " + number + " таки нет");
                }
*/


       /* int[] array = new int[45];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 101) - 50);
            System.out.print(array[i] + " ");
        }
            int min = array[0];
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            for (int i = 1; i < array.length; i++) {
            if ( array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("\nМинимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
         }*/






       /* Scanner input = new Scanner(System.in);
        System.out.print("Введите четное число для определения размера массива: ");
        int num = input.nextInt();
        if (num % 2 != 0) {
            System.out.println("Введите четное число!");
            System.exit(0);
        }
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < num / 2; i++) {
            for (int j = i + 1; j < num / 2; j++) {
                if (arr[i] > arr[j]) {
                    int min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }
            }
        }
        for (int i = num / 2; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] < arr[j]) {
                    int max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


*/







        Scanner input = new Scanner(System.in);
        System.out.print("Введите цифру основания треугольника: ");
        int side = input.nextInt();
        for (int i = side; i > 0; i--) {
            for (int a = 0; a < i; a++) {
                if (a == 0 || a == i - 1 || i == side) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = side; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}






