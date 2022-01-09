import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        int s1,s2,secim;
        Scanner giris=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        s1=giris.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        s2=giris.nextInt();
        System.out.println("1-Toplama\n2-Bölme\n3-Çarpma\n4-Bölme");
        System.out.println("Lütfen yapmak istediğiniz işlemi sayı girerek seçiniz.");

        secim=giris.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplama işlemi sonucunuz:" + (s1+s2));
            break;
            case 2:
                System.out.println("Çıkarma işlemi sonucunuz:" + (s1-s2));
                break;
            case 3:
                System.out.println("Çarpma işlemi sonucunuz:"+ (s1*s2));
                break;
            case 4:
                if (s1!=0) {
                    System.out.println("Bölme işlemi sonucunuz:" + (s1 / s2));
                }
                else{
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            case 5:
                System.out.println("Hatalı bir tuşlama yaptınız.Tekrar deneyiniz.");

            break;
        }
    }
}
