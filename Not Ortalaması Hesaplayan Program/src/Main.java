import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        //Değişkenler oluşturuldu.
        int mat, fizik, kimya, turkce, tarih, muzik;


        // Scanner sınıfı tamamlandı.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al.

        System.out.print("Matematik Notunuz:");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print("Turkce Notunuz:");
        turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuz:");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Müzik Notunuz:");
        muzik = inp.nextInt();
        System.out.println(muzik);

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = (toplam / 6);

       if (sonuc<60)
       {
           System.out.print("Maalesef Sınıfta kaldınız.");
        }

       else
       {
           System.out.print("Sınıfı Başarı ile geçtiniz.");
       }
    }}
