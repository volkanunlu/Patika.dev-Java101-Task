import java.util.Scanner;

public class KDV_HESAPLA {

    public static void main(String[]args) {

        int fiyat;
        double kdv;
        double kdvfiyat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen fiyatı giriniz:");
        fiyat = inp.nextInt();

        if(fiyat<1000)
        {
            kdv = (fiyat * 0.18) + (fiyat);
            kdvfiyat=kdv-fiyat;
            System.out.println("Ana Fiyat:" +fiyat);
            System.out.println("Kdv'li fiyatınız:" + kdv);
            System.out.println("Kdv fiyatınız:" + kdvfiyat);

        }
        else
        {
            kdv = (fiyat * 0.08) + (fiyat);
            kdvfiyat=kdv-fiyat;
            System.out.println("Ana Fiyat:" +fiyat);
            System.out.println("Kdv'li toplam fiyatınız:" + kdv);
            System.out.println("Kdv fiyatınız:" + kdvfiyat);

        }



    }}


