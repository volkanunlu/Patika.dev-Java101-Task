import java.util.Scanner;

//Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.


public class Main {

    public static void main(String[]args)
    {
        int sayi;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen Çin Zodyak Hesabı Adına Doğum Yılınızı Giriniz:");
        sayi=inp.nextInt();

        if (sayi%12==0)
        {
         System.out.println("Çin Zodyağı Burcunuz: Maymun");
        }
        else if (sayi%12==1)
        {
            System.out.println("Çin Zodyağı Burcunuz: Horoz ");
        }
        else if (sayi%12==2)
        {
            System.out.println("Çin Zodyağı Burcunuz: Köpek ");
        }
        else if (sayi%12==3)
        {
            System.out.println("Çin Zodyağı Burcunuz: Domuz ");
        }
        else if (sayi%12==4)
        {
            System.out.println("Çin Zodyağı Burcunuz: Fare ");
        }
        else if (sayi%12==5)
        {
            System.out.println("Çin Zodyağı Burcunuz: Öküz ");
        }
        else if (sayi%12==6)
        {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan ");
        }
        else if (sayi%12==7)
        {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }
        else if (sayi%12==8)
        {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha ");
        }
        else if (sayi%12==9)
        {
            System.out.println("Çin Zodyağı Burcunuz: Yılan ");
        }
        else if (sayi%12==10)
        {
            System.out.println("Çin Zodyağı Burcunuz: At ");
        }
        else
        {
            System.out.println("Çin Zodyağı Burcunuz: Koyun ");
        }


    }


}
