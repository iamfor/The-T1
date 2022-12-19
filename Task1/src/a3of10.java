import java.util.Scanner;

public class a3of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ex_chickens = {2, 1, 5};
        int[] ex_cows = {3, 2, 2};
        int[] ex_pigs = {5, 3, 8};
        System.out.println("Пример возвращения количества ног животных:");
        System.out.println("animals(" + ex_chickens[0] + ", " + ex_cows[0] + ", " + ex_pigs[0] + ") ➞ " + animals(ex_chickens[0], ex_cows[0], ex_pigs[0]));
        System.out.println("animals(" + ex_chickens[1] + ", " + ex_cows[1] + ", " + ex_pigs[1] + ") ➞ " + animals(ex_chickens[1], ex_cows[1], ex_pigs[1]));
        System.out.println("animals(" + ex_chickens[2] + ", " + ex_cows[2] + ", " + ex_pigs[2] + ") ➞ " + animals(ex_chickens[2], ex_cows[2], ex_pigs[2]));
        while (true) {
            System.out.println("Введите количество куриц. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Введите количество коров. Введите Exit - для выхода из программы");
            String b = scan.next();
            if (b.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("Введите количество свиней. Введите Exit - для выхода из программы");
            String c = scan.next();
            if (c.equalsIgnoreCase("Exit")) {
                break;
            }
            if (isNumeric(a) && isNumeric(b) && isNumeric(c))
                System.out.println("animals(" + a + ", " + b + ", " + c + ") ➞ " + animals(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c)));
        }
    }
    public static int animals(int a, int b, int c) {
        return (a*2)+(b*4)+(c*4);
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
