public class a1of10 {
    public static void main(String[] args) {
        int[] fst = {1, 3, -9, 5};
        int[] scnd = {3, 4, 45, 5};
        System.out.println("remainder(" + fst[0] + ", " + scnd[0] + ") ➞ " + ost(fst[0], scnd[0]));
        System.out.println("remainder(" + fst[1] + ", " + scnd[1] + ") ➞ " + ost(fst[1], scnd[1]));
        System.out.println("remainder(" + fst[2] + ", " + scnd[2] + ") ➞ " + ost(fst[2], scnd[2]));
        System.out.println("remainder(" + fst[3] + ", " + scnd[3] + ") ➞ " + ost(fst[3], scnd[3]));
    }
    public static int ost(int a, int b) {
        return a%b;
    }
}
