import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Harmonik seri için bir sayı giriniz:");
        int sayi=inp.nextInt();

        double toplam=0.0;
        for (double i=1 ; i<=sayi; i++)
        {
            toplam+=(1.0/i);

        }
        System.out.println("Harmonik seri sonucu: "+toplam); // tüm adımları görmek isterseniz bu satırı döngü içerisine yerleştiriniz.


    }
}
