package HW_20;


class Seller extends Person {
    private boolean isHonest;

    public Seller(String name, int age, boolean isHonest) {
        super(name, age);
        this.isHonest = isHonest;
    }

    public boolean isHonest() { return isHonest; }

    public void role() {
        System.out.println("Я продавец");
    }
}

