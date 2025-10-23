public class CarpimTablosu {
    public static void main(String[] args) {
        int sayi = 2;

        System.out.println("Çarpım Tablosu: " + sayi);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", sayi, i, sayi * i);
        }
    }
}
