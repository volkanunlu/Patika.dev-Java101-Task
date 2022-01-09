import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        int k;

        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        k=inp.nextInt();

        for(int i = 1; i<=k; i++)
        {
            if ((i%20==0)||(i==1))

                System.out.println("Girdiğiniz sayıya kadar olan 4 ve 5'in kuvvetleri:\n" +i);
        }

    }
}
