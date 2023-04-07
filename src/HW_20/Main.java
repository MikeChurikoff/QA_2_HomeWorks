package HW_20;


import java.util.Scanner;

public class Main {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя покупателя: ");
        String buyerName = scanner.nextLine();

        System.out.print("Введите возраст покупателя: ");
        int buyerAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите наименование товара: ");
        String productName = scanner.nextLine();

        System.out.print("Есть ли у покупателя дисконтная карта (Да/Нет): ");
        boolean hasDiscountCard = scanner.nextLine().equalsIgnoreCase("Да");

        System.out.print("Продавец честный (Да/Нет): ");
        boolean isHonest = scanner.nextLine().equalsIgnoreCase("Да");

        Seller seller = new Seller("Иммануил", 30, isHonest);
        Buyer buyer = new Buyer(buyerName, buyerAge, hasDiscountCard);
        Shop shop = new Shop("Пиво - Воды", productName, 100, seller, buyer);
        shop.returnCost();
    }
}



