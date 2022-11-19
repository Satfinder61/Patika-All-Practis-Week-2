import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {

        // It Finds your horoscope from the entered birth date using if-else.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        int month = scanner.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        int day = scanner.nextInt();

        String horoscope = "";
        String error = "Hatalı bir veri girdiniz. Lütfen tekrar kontrol ediniz.";

        if (month == 1)
        {
            if (day >= 1 && day <= 31)
            {
                if (day <= 21)
                {
                    horoscope = "Oğlak burcu";
                    System.out.println(horoscope);
                } else
                {
                    horoscope = "Kova burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 2)
        {
            if (day >= 1 && day <= 28)
            {
                if (day <= 19)
                {
                    horoscope = "Kova burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Balık burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 3)
        {
            if (day >= 1 && day <= 31)
            {
                if (day <= 20)
                {
                    horoscope = "Balık burcu";
                    System.out.println(horoscope);

                } else
                {
                    horoscope = "Koç burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 4)
        {
            if (day >= 1 && day <= 30)
            {
                if (day <= 20)
                {
                    horoscope = "Koç burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Boğa burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 5)
        {
            if (day >= 1 && day <= 31)
            {
                if (day <= 21)
                {
                    horoscope = "Boğa burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "İkizler burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 6)
        {
            if (day >= 1 && day <= 30)
            {
                if (day <= 22)
                {
                    horoscope = "İkizler burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Yengeç burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 7)
        {
            if (day >= 1 && day <= 31)
            {
                if (day <= 22)
                {
                    horoscope = "Yengeç burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Aslan burcu";
                    System.out.println(horoscope);

                }
            } else {
                System.out.println(error);
            }
        }
        else if (month == 8)
        {
            if (day >= 1 && day <= 31)
            {
                if (day <= 23)
                {
                    horoscope = "Aslan burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Başak burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 9)
        {
            if (day >= 1 && day <= 30)
            {
                if (day <= 22)
                {
                    horoscope = "Başak burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Terazi burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 10)
        {
            if (day >= 1 && day <= 31)
            {
                if (day <= 22)
                {
                    horoscope = "Terazi burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Akrep burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 11)
        {
            if (day >= 1 && day <= 30)
            {
                if (day <= 21)
                {
                    horoscope = "Akrep burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Yay burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else if (month == 12)
        {
            if (day >= 1 && day <= 31)
            {
                if (day <= 21)
                {
                    horoscope = "Yay burcu";
                    System.out.println(horoscope);

                }
                else
                {
                    horoscope = "Oğlak burcu";
                    System.out.println(horoscope);

                }
            }
            else
            {
                System.out.println(error);
            }
        }
        else
        {
            System.out.println(error);
        }
    }
}
