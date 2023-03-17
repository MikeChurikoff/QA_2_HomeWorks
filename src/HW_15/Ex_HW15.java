package HW_15;

import java.io.PrintStream;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex_HW15 {

    public static void main(String[] args) {
       /* Scanner string = new Scanner(System.in);
        System.out.println("Введите в консоль:\nЯ тестирую замечательно. Что еще нужно?");
        String string1 = string.next();
        System.out.println(string1);
        String string2 = string.next();
        System.out.println(string2);
        String string3 = string.next();
        System.out.println(string3.replace(".",""));
        String string4 = string.nextLine();
        System.out.println(string4.trim());*/



        /*Scanner triangle = new Scanner(System.in);
        System.out.println("Введите длину трех сторон треугольника");
        int side1 = triangle.nextInt();
        int side2 = triangle.nextInt();
        int side3 = triangle.nextInt();
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
            System.out.println("Треугольник");
        else
            System.out.println("Не треугольник");*/


       /* Date date = new Date();
        Scanner intAge = new Scanner(System.in);
        System.out.println("Введите свой год рождения");
        int age = intAge.nextInt();
        String year = String.format("%tY",date);
        int intYear = Integer.parseInt(year);
        System.out.println(intYear-age);*/


       /* Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        Scanner intAge = new Scanner(System.in);
        System.out.println("Введите свой год рождения");
        int age = intAge.nextInt();
        System.out.println(year-age);*/
        //Второй вариант не такой громоздкий кажется


       /* System.out.printf("Чтобы написать этот код на нужны %n1)Язык программирования" +
                " %n2)Среда разработки %n3)Воодушевление");
*/
        /*int x = 5;
        int y = 7;
        System.out.printf("Число %1$d больше %2$d, и это %3$b", x, y, null);*/
        //Возможно немного не понял условия)

        /*Date date = new Date();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите спецификатор формата для времени или даты");
        String timeDate = input.nextLine();
        if (timeDate.equals("Время"))
            System.out.printf( "%tT", date);
        else if (timeDate.equals("Дата"))
            System.out.printf("%1$td:%1$tm:%1$ty", date);
        else
            System.out.println("На заборе такое пиши!");*/
        //Тут тоже не понял немного насчет ввода спецификатора формата. Поставил ввод таким(



        Scanner input = new Scanner(System.in);
        Date date = new Date();
        System.out.println("Введите свое имя");
        String name = input.nextLine();
        System.out.println("Введите номер задания");
        int number = input.nextInt();
        System.out.printf("Уважаемый %1$s, Вы выполняете задание номер %2$d," +
                          " и делаете это в %3$tH часов %3$tM минут в %3$tA.", name, number, date);


    }
}
