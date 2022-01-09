import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        int k;

        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        k=inp.nextInt();

        for(int i = 1; i<=k; i*=2)
        {

            System.out.println("Girdiğiniz sayıya kadar olan 2 kuvvetleri:\n" +i);
        }

    }
}
