package HW_19;


import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            start();
        }

        public static void start() {
            System.out.println("Калькулятор запущен.");
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Введите бинарную операцию (операнд1 +||-||/||* операнд2): ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("Stop")) {
                    System.out.println("Калькулятор закрыт.");
                    break;
                }
                String[] parts = input.split("[+\\-*/]");
                if (parts.length != 2) {
                    System.out.println("Введите корректное действие.");
                    continue;
                }
                double x = Double.parseDouble(parts[0]);
                double y = Double.parseDouble(parts[1]);
                if (input.contains("+")) {
                    System.out.println(summ(x, y));
                } else if (input.contains("-")) {
                    System.out.println(minus(x, y));
                } else if (input.contains("*")) {
                    System.out.println(multiply(x, y));
                } else if (input.contains("/")) {
                    System.out.println(division(x, y));
                } else {
                    System.out.println("Введите корректное действие.");
                }
            }
            scanner.close();
        }

        public static double summ(double x, double y) {
            return x + y;
        }

        public static double minus(double x, double y) {
            return x - y;
        }

        public static double multiply(double x, double y) {
            return x * y;
        }

        public static double division(double x, double y) {
            return x / y;
        }

    }


