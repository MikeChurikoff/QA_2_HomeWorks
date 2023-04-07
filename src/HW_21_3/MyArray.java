package HW_21_3;


import java.util.Scanner;





public class MyArray {


    static class IndexOutException extends Exception {
        public IndexOutException(String message) {
            super(message);
        }
    }


    static class ZeroValueException extends Exception {
        public ZeroValueException(String message) {
            super(message);
        }
    }

    public double CreatMyArray() throws MyArray.IndexOutException, MyArray.ZeroValueException {
        int size = (int) (Math.random() * 30) + 1;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 31);

        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите индекс элемента массива:");
        //printArray(arr);
        int index = in.nextInt();

        if (index < 0 || index >= size) {
            throw new IndexOutException("Индекс больше размера массива!");
        }
        if (arr[0] == 0) {
            throw new ZeroValueException("Деление на 0!");
        }
        return (double) arr[index] / arr[0];

    }

 /* private void printArray(int[] arr) {
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }*/
}
