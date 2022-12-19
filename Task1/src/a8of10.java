import java.util.Scanner;

public class a8of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_base = {8, 5, 9};
        int[] ex_height = {10, 7, 2};
        System.out.println("Пример возвращения третей стороны треугольника:");
        System.out.println("nextEdge(" + ex_base[0] + ", " + ex_height[0] + ") ➞ " + area(ex_base[0], ex_height[0]));
        System.out.println("nextEdge(" + ex_base[1] + ", " + ex_height[1] + ") ➞ " + area(ex_base[1], ex_height[1]));
        System.out.println("nextEdge(" + ex_base[2] + ", " + ex_height[2] + ") ➞ " + area(ex_base[2], ex_height[2]));
        while (true) {
            System.out.println("Введите длинну первой стороны треугольника. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Введите длинну второй стороны треугольника. Введите Exit - для выхода из программы");
            String b = scan.next();
            if (b.equalsIgnoreCase("Exit")) {
                break;
            }
            if (isNumeric(a) && isNumeric(b))
                System.out.println("nextEdge(" + a + ", " + b + ") ➞ " + area(Integer.parseInt(a), Integer.parseInt(b)));
        }
    }
    public static int area(int a, int b) {
        return a+b-1;
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
