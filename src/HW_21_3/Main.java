package HW_21_3;


public class Main {
    public static void main(String[] args) {



        try {
            MyArray myArray = new MyArray();
            double result = myArray.CreatMyArray();
            System.out.println("Результат деления: " + result);
        } catch (MyArray.IndexOutException e) {
            System.out.println(e.getMessage());
        } catch (MyArray.ZeroValueException e) {
            System.out.println(e.getMessage());
        }
    }
}