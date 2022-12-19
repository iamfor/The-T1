import java.util.Arrays;
import java.util.Scanner;

public class a10of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_a = {42, 5, 10};
        int[] ex_b = {5, 2, 1};
        int[] ex_c = {1, 2, 3};
        System.out.println("Пример функции:");
        System.out.println("abcmath(" + Arrays.toString(ex_a) + ") ➞ " + profit(ex_a));
        System.out.println("abcmath(" + Arrays.toString(ex_b) + ") ➞ " + profit(ex_b));
        System.out.println("abcmath(" + Arrays.toString(ex_c) + ") ➞ " + profit(ex_c));
        while (true) {
            System.out.println("Введите числа через пробел. Введите Exit - для выхода из программы");
            String a = scan.nextLine();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            String[] num = a.split(" ");
            int[] b = new int[num.length];
            if (num[0].isEmpty()) {
                b[0] = 0;
            }
            else {
                if (isNumeric(num[0])) {
                    for (int i = 0; i < num.length; i++) {
                        b[i] = Integer.parseInt(num[i]);
                    }
                }
            }
            if (isNumeric(num[0])) {
                System.out.println("abcmath(" + Arrays.toString(b) + ") ➞ " + profit(b));
            }
        }
    }
    public static boolean profit(int[] as) {
        int s = as[0];
        for (int i=1; i<=as[1]; i++) {
            s = s+s;
        }
        return s % as[2] == 0;
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
