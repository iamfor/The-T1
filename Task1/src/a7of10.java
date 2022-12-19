import java.util.Scanner;

public class a7of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_up = {3, 10, 7};

        System.out.println("Пример возвращения суммы:");
        System.out.println("addUpTo(" + ex_up[0] + ") ➞ " + summa(ex_up[0]));
        System.out.println("addUpTo(" + ex_up[1] + ") ➞ " + summa(ex_up[1]));
        System.out.println("addUpTo(" + ex_up[2] + ") ➞ " + summa(ex_up[2]));
        while (true) {
            System.out.println("Введите число. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            if (isNumeric(a))
                System.out.println("addUpTo(" + a + ") ➞ " + summa(Integer.parseInt(a)));
        }
    }
    public static int summa(int a) {
        return a*(a+1)/2;
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
