import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        String username = scanner.nextLine();

        System.out.print("Şifreniz: ");
        String password = scanner.nextLine();

        if (username.equals("Patika") && password.equals("6161"))
            System.out.println("Giriş yaptınız !");

        else
        {
            System.out.println("Kullanıcı adınız veya parolanız yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Y/N)");
            String changePassword = scanner.nextLine();

            if (changePassword.equals("Y"))
            {
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = scanner.nextLine();

                if (newPassword.equals("6161"))
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                    if (!newPassword.equals(password))
                    {
                        System.out.print("Yeni şifrenizi giriniz: ");
                        newPassword = scanner.nextLine();
                        System.out.println("Şifre oluşturuldu.");
                    }
                }
            }
            else
            {
                System.out.println("Programdan çıkılıyor...");
                System.exit(0);
            }
        }
    }
}