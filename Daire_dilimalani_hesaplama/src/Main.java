import  java.util.Scanner;

//Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//𝜋 sayısını = 3.14 alınız.
//
//Formül : (𝜋 * (r*r) * 𝛼) / 360

public class Main {

    public static void main(String[]args)
    {

        double r , a , pi , hesap;
        pi=3.14;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen yarıçapı giriniz:");
        r=girdi.nextDouble();

        Scanner girdi2 = new Scanner(System.in);
        System.out.println("Lütfen açıyı giriniz :");
        a=girdi.nextDouble();
    
        hesap= (pi * (r*r) * a) / 360 ;

        System.out.println("Verilen değerlere göre daire diliminin alanı : " + hesap);


    }
}
