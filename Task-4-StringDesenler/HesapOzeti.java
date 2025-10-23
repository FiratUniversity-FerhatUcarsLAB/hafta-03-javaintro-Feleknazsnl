public class HesapOzeti {
    public static void main(String[] args) {
        String[] urunler = {"Elma", "Ekmek", "Süt"};
        int[] miktarlar = {3, 2, 1};
        double[] fiyatlar = {2.5, 1.75, 3.0};

        System.out.println("+-------------------------------+");
        System.out.println("| Ürün     | Miktar | Fiyat (TL)|");
        System.out.println("+-------------------------------+");

        for (int i = 0; i < urunler.length; i++) {
            System.out.printf("| %-8s | %-6d | %9.2f |\n", urunler[i], miktarlar[i], fiyatlar[i]);
        }

        System.out.println("+-------------------------------+");
    }
}
