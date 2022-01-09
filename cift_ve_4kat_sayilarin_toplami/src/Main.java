import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
        int n;
        int total=0;
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("Lütfen bir sayı giriniz:");
            n = inp.nextInt();
            if (n % 4 == 0) {
                total += n;

            }}

        while(n%2==0);
        System.out.println("Çift ve 4'ün katı olan sayıların toplamı:" + total);

    }
}

