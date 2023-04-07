package HW_20;


class Buyer extends Person implements Discountable {
    private boolean hasDiscountCard;

    public Buyer(String name, int age, boolean hasDiscountCard) {
        super(name, age);
        this.hasDiscountCard = hasDiscountCard;
    }

    public boolean hasDiscountCard() { return hasDiscountCard; }

    public void role() {
        System.out.println("Я покупатель");
    }

    public double applyDiscount(double price) {
        if (hasDiscountCard) {
            return price * 0.9;
        } else {
            return price;
        }
    }
}
