import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1-100 arası asal sayıları bulan program.Asal sayılar sadece 1 ve kendisine bölünen sayılardır.

        int sayac = 0;
        for (int sayi = 2; sayi <= 100; sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) { //bir başka böleni var mı kontrol ediliyor.
                    kontrol = 1;  //eğer varsa değişkene 1 değerini atıyoruz.
                    break;
                }
            }

            if (kontrol == 0)  //bir başka böleni yok ise, değişken ilk tanımladığımız halinde kaldıysa
            {
                System.out.print(sayi + " Asal bir sayıdır.\n"); //ekrana asal sayıları yazdırıyoruz.
                sayac++;
            }
        }
    }
}
