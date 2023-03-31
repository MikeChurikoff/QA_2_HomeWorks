package HW_18;

public class NumSum {
  /*  public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
    public static int calcSum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        printSum(10, 50);
        int res = calcSum(40, 70);
        System.out.println(res);
    }
*/


       public static void prnSum(int a, int b) {
            int sum = a + b;
            System.out.println(a + " + " + b + " равно " + sum);
        }
        public static int calcSum(int a, int b) {
            int sum = a + b;
            return sum;
        }
        public static void main(String[] args) {
            int x = 5;
            int y = 7;
            prnSum(x, y);
            int sum = calcSum(x, y);
            System.out.println(x + " + " + y + " равно " + sum);
        }
}



