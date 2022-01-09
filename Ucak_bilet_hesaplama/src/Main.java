import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        double mesafe,yas,yolculuktipi,ucret,indirim;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen yolculuk mesafenizi giriniz:");
        mesafe=inp.nextDouble();
        if (mesafe<0)
        {
            System.out.println("Hatalı mesafe girişi yaptınız:");
        }
        else {
            System.out.println("Lütfen yaşınızı giriniz:");
            yas=inp.nextDouble();
            System.out.println("Lütfen yolculuk tipinizi belirtiniz:\n1-Gidiş\n2-Gidiş-Dönüş");
            yolculuktipi=inp.nextDouble();

            if ((yolculuktipi==1) && (yas<12))
            {
            ucret=mesafe*0.10;
            indirim= ucret-(ucret*0.50);
            System.out.println("Yolculuk ücretiniz : " + indirim+ "TL\nİyi yolculuklar dileriz.");
            }
            else if (((yolculuktipi==2) && (yas<12))){

                ucret=mesafe*0.10;
                indirim= ucret-(ucret*0.50+(ucret*0.20));
                System.out.println("Yolculuk ücretiniz : " + indirim+ "TL\nİyi yolculuklar dileriz.");
            }
            else if  ((yolculuktipi==1) && (yas>=12) && (yas<=24))
            {
                ucret=mesafe*0.10;
                indirim= ucret-((ucret*0.10));
                System.out.println("Yolculuk ücretiniz : " + indirim+ "TL\nİyi yolculuklar dileriz.");
            }
            else if ((yolculuktipi==2) && (yas>=12) && (yas<=24)){

                ucret=mesafe*0.10;
                indirim= ucret-((ucret*0.10)+(ucret*0.20));
                System.out.println("Yolculuk ücretiniz : " + indirim+ "TL\nİyi yolculuklar dileriz.");
            }
            else if ((yolculuktipi==1) && (yas>65)){

                ucret=mesafe*0.10;
                indirim= ucret-((ucret*0.10)+(ucret*0.30));
                System.out.println("Yolculuk ücretiniz : " + indirim+ "TL\nİyi yolculuklar dileriz.");
            }
            else if (((yolculuktipi==2) && (yas>65)))
            {
                ucret=(mesafe*0.10);
                indirim=ucret-((ucret*0.20)+(ucret*0.30));
                System.out.println("Yolculuk ücretiniz : " +indirim+ "TL\nİyi yolculuklar dileriz.");

            }

            else if (yolculuktipi==1)
            {
             ucret=(mesafe*0.10);
                System.out.println("Yolculuk ücretiniz : " +ucret+ "TL\nİyi yolculuklar dileriz.");
            }
            else {
                ucret=(mesafe*0.10);
                indirim=ucret-((ucret*0.20));
                System.out.println("Yolculuk ücretiniz : " +indirim+ "TL\nİyi yolculuklar dileriz.");

            }
        }


    }
}
