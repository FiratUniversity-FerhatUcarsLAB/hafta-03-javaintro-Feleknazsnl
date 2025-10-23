public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 278;

        int yuzluk = miktar / 100;
        miktar %= 100;

        int ellilik = miktar / 50;
        miktar %= 50;

        int yirmilik = miktar / 20;
        miktar %= 20;

        int beslik = miktar / 5;
        miktar %= 5;

        int ikilik = miktar / 2;
        miktar %= 2;

        int birlik = miktar;

        System.out.println("Para bozma sonucu:");
        System.out.println(yuzluk + " x 100 TL");
        System.out.println(ellilik + " x 50 TL");
        System.out.println(yirmilik + " x 20 TL");
        System.out.println(beslik + " x 5 TL");
        System.out.println(ikilik + " x 2 TL");
        System.out.println(birlik + " x 1 TL");
    }
}
