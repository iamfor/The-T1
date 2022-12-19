import java.util.Scanner;

public class a5of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_N = {24, 24, 15};
        int[] ex_a = {15, 26, 11};
        int[] ex_b = {9, 2, 11};
        System.out.println("Пример функции:");
        System.out.println("operation(" + ex_N[0] + ", " + ex_a[0] + ", " + ex_b[0] + ") ➞ " + profit(ex_N[0], ex_a[0], ex_b[0]));
        System.out.println("operation(" + ex_N[1] + ", " + ex_a[1] + ", " + ex_b[1] + ") ➞ " + profit(ex_N[1], ex_a[1], ex_b[1]));
        System.out.println("operation(" + ex_N[2] + ", " + ex_a[2] + ", " + ex_b[2] + ") ➞ " + profit(ex_N[2], ex_a[2], ex_b[2]));
        while (true) {
            System.out.println("Введите получаемое число. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Введите первое число. Введите Exit - для выхода из программы");
            String b = scan.next();
            if (b.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Введите второе число. Введите Exit - для выхода из программы");
            String c = scan.next();
            if (c.equalsIgnoreCase("Exit")) {
                break;
            }
            if (isNumeric(a) && isNumeric(b) && isNumeric(c))
                System.out.println("operation(" + a + ", " + b + ", " + c + ") ➞ " + profit(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c)));
        }
    }
    public static String profit(int a, int b, int c) {
        if (b+c==a) {
            return "added";
        }
        if (b-c==a) {
            return "subtracted";
        }
        if (b*c==a) {
            return "multiplied";
        }
        if (b/c==a) {
            return "separated";
        }
        return "none";
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
