import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.println("Lütfen bir sayı giriniz:");
            n = inp.nextInt();
            if (n % 2 == 1) {
                total += n;

            }}
            while(n > 0);
                System.out.println("Tek sayıların toplamı:" + total);

        }
    }



