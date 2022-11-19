import java.util.Scanner;
/*Conditions :

Suggest to "Ski" if the temperature is less than 5.
Suggest the "Cinema" event if the temperature is between 5 and 15.
Suggest the "Picnic" event if the temperature is between 15 and 25.
Suggest the "Swimming" event if the temperature is greater than 25.
Find different solutions in how else the if conditions could be created on the same example.*/

public class SuggestEvents {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Sıcaklığı giriniz: ");
        // Used to get heat information of the weather from the user
        int heat = scanner.nextInt();


        if(heat < 5)
            System.out.println("Kayağa gidebilirsiniz.");
        else if (heat >= 5 && heat <=15)
            System.out.println("Sinemaya gidebilirsiniz.");
        else if (heat >=15 && heat <=25)
            System.out.println("Pikniğe gidebilirsiniz.");
        else if (heat > 25)
            System.out.println("Yüzmeye gidebilirsiniz.");



    }
}
