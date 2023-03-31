package HW_18;


    import java.util.Scanner;

    public class OverLoad {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            printMessage();
            System.out.print("Введите сообщение: ");
            String message = input.nextLine();
            printMessage(message);
            System.out.print("Введите несколько строк через пробел: ");
            String[] stringArray = input.nextLine().split(" ");
            printMessage(stringArray);
            System.out.print("Введите несколько чисел через пробел: ");
            String[] numberStrings = input.nextLine().split(" ");
            int[] numbers = new int[numberStrings.length];
            for (int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
            printMessage(numbers);
            System.out.print("Введите сообщение: ");
            message = input.nextLine();
            System.out.print("Введите число: ");
            int num = input.nextInt();
            printMessage(num, message);
        }

        public static void printMessage() {
            System.out.println("Я пустой");
        }

        public static void printMessage(String message) {
            System.out.println(message);
        }

        public static void printMessage(String[] stringArray) {
            for (String s : stringArray) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        public static void printMessage(int[] numbers) {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            System.out.println("Сумма ваших чисел: " + sum);
        }

        public static void printMessage(int num, String message) {
            System.out.println("Ваше сообщение - \"" + message + "\", ваше число - " + num);
        }
    }



