import java.util.Scanner;

public class a4of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] ex_prob = {0.2, 0.9, 0.9};
        double[] ex_prize = {50, 1, 3};
        double[] ex_pay = {9, 2, 2};
        System.out.println("Пример:");
        System.out.println("profitableGamble(" + ex_prob[0] + ", " + ex_prize[0] + ", " + ex_pay[0] + ") ➞ " + profit(ex_prob[0], ex_prize[0], ex_pay[0]));
        System.out.println("profitableGamble(" + ex_prob[1] + ", " + ex_prize[1] + ", " + ex_pay[1] + ") ➞ " + profit(ex_prob[1], ex_prize[1], ex_pay[1]));
        System.out.println("profitableGamble(" + ex_prob[2] + ", " + ex_prize[2] + ", " + ex_pay[2] + ") ➞ " + profit(ex_prob[2], ex_prize[2], ex_pay[2]));
        while (true) {
            System.out.println("Введите число Prob. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Введите число Prize. Введите Exit - для выхода из программы");
            String b = scan.next();
            if (b.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Введите число Pay. Введите Exit - для выхода из программы");
            String c = scan.next();
            if (c.equalsIgnoreCase("Exit")) {
                break;
            }
            if (isNumeric(a) && isNumeric(b) && isNumeric(c))
                System.out.println("profitableGamble(" + a + ", " + b + ", " + c + ") ➞ " + profit(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c)));
        }
    }
    public static boolean profit(double a, double b, double c) {
        return a * b > c;
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
