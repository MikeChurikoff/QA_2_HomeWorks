package HW_21_4;


enum ProductType {
    APPLE(10), POTATO(15), MILK(30), BEER(50), TOBACCO(70);
    private int price;
    ProductType(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}

