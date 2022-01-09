import  java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int sayi1,sayi2,i,ebob=1,ekok;
        Scanner inp=new Scanner(System.in);
        System.out.print(" 1.sayıyı giriniz :");  //kullanıcı girişi
        sayi1=inp.nextInt();
        System.out.print(" 2.sayıyı giriniz :");    //kullanıcı girişi
        sayi2=inp.nextInt();

        if(sayi1>sayi2)
            i=sayi1;  //hangi sayı küçükse bölüm onun en büyük katına göre ilerleyecek
        else
            i=sayi2;    //hangi sayı küçükse bölüm onun en büyük katına göre ilerleyecek

        while(true)
        {
            if(sayi1%i==0 && sayi2%i==0)  //eğer bölümünden kalan 0 ise
            {
                ebob=i; //ebob değişkenine en büyük katı ata.
                break;
            }
            i--;
        }
        System.out.println("Ebob :"+ebob); //ekrana yazdır
        ekok=sayi1*sayi2/ebob;
        System.out.println("Ekok:" +ekok);  //ekrana yazdır

    }



}

