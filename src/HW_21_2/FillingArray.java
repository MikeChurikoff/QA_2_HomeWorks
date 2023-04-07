package HW_21_2;


import java.util.ArrayList;
import java.util.List;

public class FillingArray {
    public static class ArrayOverflowException extends Exception {
        public ArrayOverflowException(String message) {
            super(message);
        }
    }

    public static void fillArray() {
        int value = 2147483638;
        List<Integer> list = new ArrayList<>();
        while (true) {
            try {
                list.add(value);
                value++;
                if (value < 0) {
                    throw new ArrayOverflowException("Массив переполнен!");
                }
            } catch (ArrayOverflowException e) {
                System.err.println(e.getMessage());
                break;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        fillArray();
    }
}

