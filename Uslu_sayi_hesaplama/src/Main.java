import java.util.Scanner;

public class Main {

   public static void main(String[]args)
    {

        int n,k;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        n=inp.nextInt();
        System.out.println("Üs olarak alınacak dereceyi giriniz:");
        k=inp.nextInt();

        int total=1;

        for (int i=1; i<=k; i++)
        {
            total*=n;
            System.out.println("Sonuç : " +total);
        }




    }
}
