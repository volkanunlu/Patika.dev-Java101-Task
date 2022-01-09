import java.util.Scanner;


//Manav Kasa Programı
        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        //Meyveler ve KG Fiyatları

        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

public class Main {


    public static void main(String[]args)
    {
        Double Armut , Elma , Domates, Muz, Patlican, Toplam ;


        Scanner armut = new Scanner(System.in);
        System.out.println("Lütfen aldığınız armut miktarını giriniz : ");
        Armut= armut.nextDouble();

        Scanner elma = new Scanner(System.in);
        System.out.println("Lütfen aldığınız elma miktarını giriniz : ");
        Elma= elma.nextDouble();

        Scanner domates = new Scanner(System.in);
        System.out.println("Lütfen aldığınız domates miktarını giriniz : ");
        Domates= domates.nextDouble();

        Scanner muz = new Scanner(System.in);
        System.out.println("Lütfen aldığınız muz miktarını giriniz : ");
        Muz= muz.nextDouble();

        Scanner patlican = new Scanner(System.in);
        System.out.println("Lütfen aldığınız patlıcan miktarını giriniz : ");
        Patlican= patlican.nextDouble();

        Toplam = (Armut * 2.14 ) + (Elma*3.67) + (Domates*1.11) + (Muz*0.95) + (Patlican*5.00);

        System.out.println("Toplam tutarınız : " + Toplam + "TL");

        
    }
}
