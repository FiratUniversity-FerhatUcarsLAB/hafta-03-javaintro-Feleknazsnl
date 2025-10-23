public class DonusumTablosu {
    public static void main(String[] args) {
        double milToKm = 1.609;
        int[] milValues = {1, 5, 10, 20, 50};

        System.out.println("+-------+-----------+");
        System.out.println("| Mil   | Kilometre |");
        System.out.println("+-------+-----------+");
        for (int mil : milValues) {
            double km = mil * milToKm;
            System.out.printf("| %5d | %9.3f |\n", mil, km);
        }
        System.out.println("+-------+-----------+");
    }
}
