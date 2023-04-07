package HW_21_4;


public class Main {
    public static void main(String[] args) {
        Father father = new Father("Валентин", 500);

        try {
            father.goToStore(ProductType.BEER, 2, ProductType.MILK, 6);
        } catch (StoreException e) {
            System.out.println(e.getMessage());
        }
    }
}

