import java.util.Scanner;

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
