public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("+-----+-----+-----+");
        System.out.println("|  a  | a^2 | a^3 |");
        System.out.println("+-----+-----+-----+");
        for (int a = 1; a <= 5; a++) {
            System.out.printf("|  %d  |  %2d |  %3d |\n", a, a*a, a*a*a);
        }
        System.out.println("+-----+-----+-----+");
    }
}
