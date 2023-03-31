package HW_18;

public class OddEvent {

    static public void prnEvenOdd(int[] arr) {
        System.out.println("Even numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Odd numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        prnEvenOdd(a);
    }
}



