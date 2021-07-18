public class HomeWorkApp {
    public static void main(String[] args) {

        int a = 4;
        int b = 8;
        boolean AB = compareSum(a, b);
        System.out.println(AB);

        printNumber(-3);

        boolean x = printNumber2(3);
        System.out.println(x);

        printMessage(3, "Something");
    }

    public static boolean compareSum(int a, int b) {
        int AB = a + b;
        return (AB >= 10 && 20 >= AB);
    }

    public static void printNumber(int number) {
        if (number >= 0) {
            System.out.println("Это число положительное");
        } else {
            System.out.println("Это число отрицательное");
        }
    }

    public static boolean printNumber2(int chislo) {
        return (chislo < 0);
    }

    public static void printMessage(int count, String message) {
        int y = 0;
        while (y < count) {
            System.out.println(message);
            y++;
        }
    }
}