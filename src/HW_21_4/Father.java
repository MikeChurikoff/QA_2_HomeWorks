package HW_21_4;


public class Father {
    private String name;
    private double moneyVallet;

    public Father(String name, double moneyVallet) {
        this.name = name;
        this.moneyVallet = moneyVallet;
    }

    public void goToStore(ProductType firstProductType, int firstProductQuantity, ProductType secondProductType, int secondProductQuantity) throws StoreException {

        double totalPrice = firstProductType.getPrice() * firstProductQuantity + secondProductType.getPrice() * secondProductQuantity;
        if (totalPrice > moneyVallet) {
            throw new StoreException("Уважаемый " + name + ", у вас недостаточно денег для покупки выбранных товаров");
        }


        if (firstProductType == ProductType.BEER || firstProductType == ProductType.TOBACCO || secondProductType == ProductType.BEER || secondProductType == ProductType.TOBACCO) {
            throw new StoreException("Уважаемый " + name + ", вы не можете купить пиво или табак");
        }


        if (firstProductQuantity % 3 != 0 || secondProductQuantity % 3 != 0) {
            throw new StoreException("Уважаемый " + name + ", количество каждого товара должно быть кратно трём");
        }

        System.out.println("Уважаемый " + name + " стоимость ваших покупок " + totalPrice);
        System.out.println("Вы приобрели " + firstProductType +  " в количестве " + firstProductQuantity + ", и " + secondProductType  + " в количестве " + secondProductQuantity);
    }
}

