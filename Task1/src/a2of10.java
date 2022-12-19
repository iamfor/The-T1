import java.util.Scanner;

public class a2of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_base = {3, 7, 10};
        int[] ex_height = {2, 4, 10};
        System.out.println("Пример возвращения площади:");
        System.out.println("triArea(" + ex_base[0] + ", " + ex_height[0] + ") ➞ " + area(ex_base[0], ex_height[0]));
        System.out.println("triArea(" + ex_base[1] + ", " + ex_height[1] + ") ➞ " + area(ex_base[1], ex_height[1]));
        System.out.println("triArea(" + ex_base[2] + ", " + ex_height[2] + ") ➞ " + area(ex_base[2], ex_height[2]));
        while (true) {
            System.out.println("Введите основание треугольника. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Введите высоту треугольника. Введите Exit - для выхода из программы");
            String b = scan.next();
            if (b.equalsIgnoreCase("Exit")) {
                break;
            }
            if (isNumeric(a) && isNumeric(b))
                System.out.println("triArea(" + a + ", " + b + ") ➞ " + area(Integer.parseInt(a), Integer.parseInt(b)));
        }
    }
    public static int area(int a, int b) {
        return a*b/2;
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
