package HW_18;

import java.util.ArrayList;
import java.util.List;

 class EvenOdd {
         public static void printEvenAndOdd(int[] arr) {
             System.out.println("Even numbers:");
             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] % 2 == 0) {
                     System.out.println(arr[i]);
                 }
             }
             System.out.println("Odd numbers:");
             for (int i = 0; i < arr.length; i++) {
                 if (arr[i] % 2 != 0) {
                     System.out.println(arr[i]);
                 }
             }
         }

     }











   /* public static void printEvenAndOdd(int[] arr) {


        // создаем два отдельных списка для четных и нечетных чисел
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        // проходим по каждому элементу массива и добавляем его в соответствующий список
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        // выводим список четных чисел
        System.out.print("Even numbers: ");
        for (int num : evenList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // выводим список нечетных чисел
        System.out.print("Odd numbers: ");
        for (int num : oddList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }*/
