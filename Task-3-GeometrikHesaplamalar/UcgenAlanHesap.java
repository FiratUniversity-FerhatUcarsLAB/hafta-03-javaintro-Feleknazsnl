public class Ucgen {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        double s = (a + b + c) / 2;  // yarı çevre
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        double cevre = a + b + c;

        System.out.printf("Üçgenin Alanı (Heron): %.2f\n", alan);
        System.out.printf("Üçgenin Çevresi: %.2f\n", cevre);
    }
}
