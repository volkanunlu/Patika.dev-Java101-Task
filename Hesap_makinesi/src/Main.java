import java.util.Scanner;

public class Main {

        public static void main(String[]args) {
            int s1, s2, select;

            Scanner input = new Scanner(System.in);
            System.out.println("İlk sayıyı giriniz:");
            s1 = input.nextInt();
            System.out.println("İkinci sayıyı giriniz:");
            s2 = input.nextInt();
            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
            System.out.println("Lütfen yapmak istediğiniz işlemin sayısını giriniz:");
            select = input.nextInt();

            if (select == 1) {
                System.out.println("Toplam Sonucunuz:" + (s1 + s2));

            }
            else if (select == 2) {
                System.out.println("Çıkarma sonucunuz:" + (s1 - s2));
            }
            else if (select==3)
            {
                System.out.println("Çarpma işlemi sonucunuz:"+ (s1*s2));
            }
            else if(select==4)
                if (s1!=0)

                {
                    System.out.println(("Bölme işlemi sonucunuz"+ (s1/s2)));
                }
                else
                {
                System.out.println("Bir sayı 0'a bölünemez.");
                }
            else
            {
            System.out.println("Yanlış tuşlama yaptınız.Tekrar deneyiniz.");
            }
        }

}