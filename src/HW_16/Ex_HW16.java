package HW_16;

import java.util.Locale;
import java.util.Scanner;

public class Ex_HW16 {
    public static void main(String[] args) {


      /*  Scanner input = new Scanner(System.in);
        System.out.println("Выберите программу: IntelliJ IDEA, Git, Java?");
        String prg = input.nextLine();
        System.out.println("Выберите ОС: Linux, macOS, Windows?");
        String sys = input.nextLine();

       if (prg.equals("IntelliJ IDEA")) {
            switch (sys) {
                case ("Linyx") -> System.out.println("Получите: https://www.jetbrains.com/ru-ru/idea/download/#section=linux");
                case ("macOS") -> System.out.println("Получите: https://www.jetbrains.com/ru-ru/idea/download/#section=mac");
                case ("Windows") -> System.out.println("Получите: https://www.jetbrains.com/ru-ru/idea/download/#section=windows");
                default -> System.out.println("Нет такой системы");

            }
        } else if (prg.equals("Git")) {
            switch (sys) {
                case ("Linyx") -> System.out.println("Получите: https://git-scm.com/download/linux");
                case ("macOS") -> System.out.println("Получите: https://git-scm.com/download/mac");
                case ("Windows") -> System.out.println("Получите: https://git-scm.com/download/win");
                default -> System.out.println("Нет такой системы");

            }
        } else if (prg.equals("Java")) {
            switch (sys) {
                case ("Linyx") -> System.out.println("Получите: https://www.java.com/ru/download/linux_manual.jsp");
                case ("macOS") -> System.out.println("Получите: https://www.java.com/en/download/apple.jsp");
                case ("Windows") -> System.out.println("Получите: https://www.java.com/en/download/");
                default -> System.out.println("Нет такой системы");

            }
        } else System.out.println("Нет такой программы");
    }
}
*/


       /* Scanner input = new Scanner(System.in);

        System.out.println("Выберите программу: IntelliJ IDEA, Git, Java");
        String prg = input.nextLine();

        System.out.println("Выберите ОС: Linux, macOS, Windows");
        String sys = input.nextLine();
        String url;
        switch (prg.toLowerCase()) {
            case "intellij idea" -> {
                switch (sys.toLowerCase()) {
                    case "linux" -> url = "https://www.jetbrains.com/ru-ru/idea/download/#section=linux";
                    case "macos" -> url = "https://www.jetbrains.com/ru-ru/idea/download/#section=mac";
                    case "windows" -> url = "https://www.jetbrains.com/ru-ru/idea/download/#section=windows";
                    default -> {
                        System.out.println("Нет такой ОС");
                        return;
                    }
                }
            }
            case "git" -> {
                switch (sys.toLowerCase()) {
                    case "linux" -> url = "https://git-scm.com/download/linux";
                    case "macos" -> url = "https://git-scm.com/download/mac";
                    case "windows" -> url = "https://git-scm.com/download/win";
                    default -> {
                        System.out.println("Нет такой ОС");
                        return;
                    }
                }
            }
            case "java" -> {
                switch (sys.toLowerCase()) {
                    case "linux" -> url = "https://www.java.com/ru/download/linux_manual.jsp";
                    case "macos" -> url = "https://www.java.com/en/download/apple.jsp";
                    case "windows" -> url = "https://www.java.com/en/download/";
                    default -> {
                        System.out.println("Нет такой ОС");
                        return;
                    }
                }
            }
            default -> {
                System.out.println("Нет такой программы");
                return;
            }
        }

        System.out.println("Ссылка для скачивания: " + url);


*/




      /*  Scanner input = new Scanner(System.in);
        System.out.println("Напиши уже что-нибудь: ");
        String txt = input.nextLine();

        int countChar = 0;
        int i = 0;
        while (i < txt.length()) {
            if (txt.charAt(i) == 'а') {
                countChar++;
            }
            i++;
        }

        System.out.println("Cимволов 'a' в строке: " + countChar);*/



/*

        Scanner inputInt = new Scanner(System.in);
        System.out.println("Введите число");
        int numOfday = inputInt.nextInt();
        if (numOfday == 1) {
            System.out.println("Понедельник");
        } else if (numOfday == 2) {
            System.out.println("Вторник");
        } else if (numOfday == 3) {
            System.out.println("Среда");
        } else if (numOfday == 4) {
            System.out.println("Четверг");
        } else if (numOfday == 5) {
            System.out.println("Пятница");
        } else if (numOfday == 6) {
            System.out.println("Суббота");
        } else if (numOfday == 7) {
            System.out.println("Воскресенье");
        } else
            System.out.println("Лучше бы сегодня была пятница");

*/





    /*    Scanner inNum = new Scanner(System.in);
        System.out.println("Введите число");
        Integer num = inNum.nextInt();
        String strNum = Integer.toString(num);
        String revStrNum = new StringBuilder(num).reverse().toString();
        //System.out.println(strNum.equals(revStrNum)?"Палиндром":"Не палиндром");
        if (strNum.equals(revStrNum)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }*/


      /*  Scanner inNum = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = inNum.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
*/







      /*  Scanner words = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();
        while (true) {
            System.out.print("Введите слово: ");
            String word = words.next();
            if (word.equalsIgnoreCase("STOP")) {
                break;            }
            sentence.append(word).append(" ");
        }
        System.out.println(sentence.toString().trim());
*/


      /*  Scanner words = new Scanner(System.in);
        String sentence = "";
        String word = "";
        while (true) {
            System.out.print("Введите слово: ");
            word = words.next();
            if (word.equalsIgnoreCase("STOP")) {
                break;
            }
            sentence += word + " ";
        }
        System.out.println(sentence.trim());*/




        Scanner storage = new Scanner(System.in);
        System.out.println("Введите обьем склада");
        int inTotalVolume = storage.nextInt();
        int countOfMetal =0;
        while (countOfMetal<=inTotalVolume){
            if((inTotalVolume-countOfMetal)==0){
                break;
            }
            System.out.println("Сколько металла хотите сдать?");
            int temp = storage.nextInt();
            if((countOfMetal+temp)>inTotalVolume) {
                System.out.println("Слишком много железа, ребята");
                System.out.println("Возьмем не больше "+(inTotalVolume-countOfMetal));
                continue;
            }
            countOfMetal=countOfMetal+temp;
            System.out.println("Осталось места на "+(inTotalVolume-countOfMetal));
        }




    }
}
