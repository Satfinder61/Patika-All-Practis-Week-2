import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {

        // Created a calculator by using switch-case

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------");

        System.out.println("Hesap Makinesi");

        System.out.println("--------------------------------------");

        System.out.print("İlk sayıyı giriniz: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("--------------------------------------");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.print("Seçiminiz: ");
        int choose = scanner.nextInt();
        System.out.println("--------------------------------------");

        switch (choose) {
            case 1 -> System.out.println("Toplamı : " + (firstNumber + secondNumber));
            case 2 -> System.out.println("Çıkarma : " + (firstNumber - secondNumber));
            case 3 -> System.out.println("Çarpma : " + (firstNumber * secondNumber));
            case 4 -> System.out.println("Bölme : " + (firstNumber / secondNumber));
            default -> System.out.println("Yanlış seçim yaptınız, lütfen düzeltin.");
        }

    }
}
