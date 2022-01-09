import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        String userName,password;

        int hak=3;
        int bakiye=1500;
        int secim;
        boolean oturum=true;
        while (hak>0)
        {
            Scanner inp = new Scanner(System.in); // bir nesne yaratıldı.
            System.out.println("Kullanıcı adınızı giriniz:");
            userName = inp.nextLine();
            System.out.println("Parolanızı giriniz:");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {

                //java'da string sınıfı eşitleme yapılırken equals kullanılır.


                System.out.println("Merhaba Kodluyoruz Bankasına hoşgeldiniz..");
                while (oturum) {

                    System.out.println("1- Para yatırma");
                    System.out.println("2- Para çekme");
                    System.out.println("3- Bakiye sorgulama");
                    System.out.println("4- Çıkış");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");

                    secim = inp.nextInt();


                switch (secim)
                {
                    case 1:
                        System.out.println("Para miktarı");
                        int para = inp.nextInt();
                        bakiye += para;
                        System.out.println("Bakiyeniz:" + bakiye);
                        break;
                    case 2:
                        System.out.println("Çekmek istediğiniz miktarı giriniz:");
                        int cekim = inp.nextInt();
                        if (cekim > bakiye) {
                            System.out.println("Çekmek istediğiniz tutar hesabınızdaki tutardan büyüktür.");
                        } else
                            bakiye -= cekim;
                        System.out.println("Bakiyeniz:" + bakiye);
                        break;
                    case 3:
                        System.out.println("Hesabınızda bulunan miktar:" + bakiye);
                        break;
                    case 4:
                        System.out.println("Bizi tercih ettiğiniz için teşekkürler.Görüşmek üzere.");
                        hak=-1;
                        break;
                    default:
                        System.out.println("Lütfen tekrar deneyin.");
                        oturum=false;
                }
            }
            }
            else
            {   hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz.");

                if (hak==0)
                {
                    System.out.println("Hesabınız bloke olmuştur.Banka ile iletişime geçiniz.");
                }
                else {
                System.out.println("Kalan hakkınız: "  + hak);
            }}

        }

    }
    }