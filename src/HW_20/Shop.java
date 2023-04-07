package HW_20;


public class Shop {
    private String name;
    private String productName;
    private double price;
    private Seller seller;
    private Buyer buyer;

    public Shop(String name, String productName, double price, Seller seller, Buyer buyer) {
        this.name = name;
        this.productName = productName;
        this.price = price;
        this.seller = seller;
        this.buyer = buyer;
    }

    public void returnCost() {
        buyer.role();

        if (productName.toLowerCase().contains("пиво") && (seller.isHonest() && buyer.getAge() < 18)) {
            System.out.println("Извините, мы не можем продать вам этот товар.");

        } else if (productName.toLowerCase().contains("пиво") && (!seller.isHonest() && buyer.getAge() < 18)) {
            System.out.println("Ладно бери");

        } else if (productName.toLowerCase().contains("пиво") && buyer.getAge() >= 18) {
            System.out.println("Уважаемый " + buyer.getName() + ", продавец " + seller.getName() +
                    " нашего магазина \"" + name + "\", продаст " + productName +
                    ", это алкоголь, а ваш возраст " + buyer.getAge() + ".");
        } else {

            System.out.println("Уважаемый " + buyer.getName() + ", продавец " + seller.getName() +
                    " нашего магазина \"" + name + "\", продаст " + productName +
                    ", это не алкоголь, а ваш возраст " + buyer.getAge() + ".");
            double discountedPrice = buyer.applyDiscount(price);
            System.out.println("Стоимость вашей покупки равна " + discountedPrice + ".");
            if (discountedPrice < price) {
                System.out.println("Вот вам скидка.");
            }
            seller.role();

        }
    }
}
