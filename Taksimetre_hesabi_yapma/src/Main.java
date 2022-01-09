import java.util.Scanner;

//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran program.
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.


public class Main {

    public static void main(String[]args)
    {
        double mesafe , hesapla;

        Scanner girdi =new Scanner(System.in);
        System.out.println("Gidilen mesafeyi  km olarak giriniz:");
        mesafe=girdi.nextDouble();

        hesapla= (mesafe * 2.20) + 10.00;
        if(hesapla<20.00)
        {
            System.out.println("Taksimetre açılış ücretimiz 10 TL iyi yolculuklar dileriz.");
            System.out.println("Ödemeniz gereken tutar 20 TL");
        }

        else
        {
            System.out.println("Taksimetre açılış ücretimiz 10 TL iyi yolculuklar dileriz.");
            System.out.println("Ödemeniz gereken tutar : " + hesapla);

        }

    }
}
