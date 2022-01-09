import java.util.Scanner;

public class Main {
    public static void main(String[]args)

    {
        double kilo, boy;

        Scanner veri= new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz:");
        kilo= veri.nextDouble();

        Scanner veri2= new Scanner(System.in);
        System.out.println("Lütfen boyunuzu virgül ile ayırarak giriniz:");
        boy= veri2.nextDouble();

//     Formül :   Kilo (kg) / Boy(m) * Boy(m)

        double endeks = (kilo) / (boy*boy);

        System.out.println("Vücut kitle endeksiniz: " + endeks);
    }

}
