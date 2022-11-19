import java.util.Scanner;

public class SortingNumberSmallestToLargest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("İlk sayıyı giriniz: ");
        int firstOne = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int secondOne = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int thirdOne = scanner.nextInt();

        if(firstOne > secondOne && firstOne > thirdOne)
        {
            if(secondOne > thirdOne)
            {
                System.out.println("Küçükten büyüğe: " + thirdOne + ", " + secondOne + ", " + firstOne);
            }
            else
            {
                System.out.println("Küçükten büyüğe: " + secondOne + ", " + thirdOne + ", " + firstOne);
            }
        }
        else if(secondOne > firstOne && secondOne> thirdOne)
        {
            if(firstOne > thirdOne)
            {
                System.out.println("Küçükten büyüğe: " + thirdOne + ", " + firstOne + ", " + secondOne);
            }
            else
            {
                System.out.println("Küçükten büyüğe: " + firstOne + ", " + thirdOne+ ", " + secondOne);
            }

        }
        else if(thirdOne > firstOne && thirdOne> secondOne)
        {
            if(firstOne > secondOne)
            {
                System.out.println("Küçükten büyüğe: " + secondOne + ", " + firstOne + ", " + thirdOne);
            }
            else
            {
                System.out.println("Küçükten büyüğe: " + firstOne + ", " + secondOne+ ", " + thirdOne);
            }

        }


    }
}
