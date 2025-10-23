public class Daire {
    public static void main(String[] args) {
        double yaricap = 5.5;
        double pi = Math.PI;

        double alan = pi * yaricap * yaricap;
        double cevre = 2 * pi * yaricap;

        System.out.printf("Dairenin Alanı: %.2f\n", alan);
        System.out.printf("Dairenin Çevresi: %.2f\n", cevre);
    }
}
