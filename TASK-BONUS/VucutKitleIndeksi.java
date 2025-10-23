public class BMIHesaplama {
    public static void main(String[] args) {
        double kilo = 70.5;  // kg
        double boy = 1.75;   // metre

        double bmi = kilo / (boy * boy);

        System.out.printf("BMI: %.2f\n", bmi);
    }
}
