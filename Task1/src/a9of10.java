import java.util.Arrays;
import java.util.Scanner;

public class a9of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_a = {1, 5, 9};
        int[] ex_b = {3, 4, 5};
        int[] ex_c = {2};
        System.out.println("Пример функции:");
        System.out.println("sumOfCubes([" + ex_a[0] + ", " + ex_a[1] + ", " + ex_a[2] + "]) ➞ " + profit(ex_a));
        System.out.println("sumOfCubes([" + ex_b[0] + ", " + ex_b[1] + ", " + ex_b[2] + "]) ➞ " + profit(ex_b));
        System.out.println("sumOfCubes([" + ex_c[0] + "]) ➞ " + profit(ex_c));
        System.out.println("sumOfCubes([]) ➞ 0");
        while (true) {
            System.out.println("Введите числа через пробел. Введите Exit - для выхода из программы");
            String a = scan.nextLine();
            String[] num = a.split(" ");
            int[] b = new int[num.length];
            if (num[0].isEmpty()) {
                b[0] = 0;
            }
            else {
                for(int i=0; i<num.length; i++) {
                    b[i] = Integer.parseInt(num[i]);
                }
            }
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("sumOfCubes(" + Arrays.toString(b) + ") ➞ " + profit(b));
        }
    }
    public static int profit(int as[]) {
        int s = 0;
        for (int i=0; i<as.length; i++) {
            s = (as[i]*as[i]*as[i])+s;
        }
        return s;
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
