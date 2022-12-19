import java.util.Scanner;

public class a6of10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] ex_param = {"A", "m", "[", "\\"};

        System.out.println("Пример возвращения ASCII:");
        System.out.println("ctoa(" + ex_param[0] + ") ➞ " + (int)(ex_param[0].charAt(0)));
        System.out.println("ctoa(" + ex_param[1] + ") ➞ " + (int)(ex_param[1].charAt(0)));
        System.out.println("ctoa(" + ex_param[2] + ") ➞ " + (int)(ex_param[2].charAt(0)));
        System.out.println("ctoa(" + ex_param[3] + ") ➞ " + (int)(ex_param[3].charAt(0)));
        while (true) {
            System.out.println("Введите Символ. Введите Exit - для выхода из программы");
            String a = scan.next();
            if (a.equalsIgnoreCase("Exit")) {
                break;
            }
            System.out.println("ctoa(" + a + ") ➞ " + (int)(a.charAt(0)));
        }
    }
}
