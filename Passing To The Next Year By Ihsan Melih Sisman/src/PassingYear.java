import java.text.DecimalFormat;
import java.util.Scanner;
/*
Courses: Mathematics, Physics, Turkish, Chemistry, Music
Passing Grade : 55
If the course grades entered are not between 0 or 100, they should not be included in the average.*/


public class PassingYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double sum = 0;
        double courseNumber = 0;


        System.out.print("Matematik notunuz: ");
        // Used to get price information of the product from the user
        float math = scanner.nextFloat();
        if(math<0 || math>100)
        {
            System.out.println("Matematik notunuz geçersiz. Ortalamaya dahil edilmedi!");
        }
        else
        {
            sum = sum + math;
            courseNumber++;
        }

        System.out.print("Fizik notunuz: ");
        // Used to get price information of the product from the user
        float physics = scanner.nextFloat();
        if(physics < 0 || physics>100)
        {
            System.out.println("Fizik notunuz geçersiz. Ortalamaya dahil edilmedi!");

        }
        else
        {
            sum = sum + physics;
            courseNumber++;
        }
        System.out.print("Kimya notunuz: ");
        // Used to get price information of the product from the user
        float chemistry = scanner.nextFloat();
        if(chemistry < 0 || chemistry>100)
        {
            System.out.println("Kimya notunuz geçersiz. Ortalamaya dahil edilmedi!");

        }
        else
        {
            sum = sum + chemistry;
            courseNumber++;
        }

        System.out.print("Türkçe notunuz: ");
        // Used to get price information of the product from the user
        float turkish = scanner.nextFloat();
        if(turkish < 0 || turkish>100)
        {
            System.out.println("Türkçe notunuz geçersiz. Ortalamaya dahil edilmedi!");

        }
        else
        {
            sum = sum + turkish;
            courseNumber++;
        }
        System.out.print("Müzik notunuz: ");
        // Used to get price information of the product from the user
        float music = scanner.nextFloat();
        if(music < 0 || music>100)
        {
            System.out.println("Müzik notunuz geçersiz. Ortalamaya dahil edilmedi!");

        }
        else
        {
            sum = sum + music;
            courseNumber++;
        }

        DecimalFormat df = new DecimalFormat("0.##");

        float average = (float) (sum /  courseNumber);
        String result = df.format(average);


        if (average > 55)
            System.out.println("Ortalamanız: "+ result +" tebrikler sınıfı geçtiniz!");
        else
            System.out.println("Ortalamanız: "+ result +" sınıfta kaldınız, seneye tekrar görüşmek üzere!");



    }
}