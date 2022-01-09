import java.util.Scanner;

//Üçgende alan hesaplama kodlarımız.
    public class Hesapla {

    public static void main(String[]args){

        double a, b, c ;

        //Kullanıcıdan verimizi alalım.

        Scanner veri= new Scanner(System.in);
        System.out.println("1.kenarı giriniz:");
        a=veri.nextDouble();

        Scanner veri2= new Scanner(System.in);
        System.out.println("2.kenarı giriniz:");
        b=veri2.nextDouble();

        Scanner veri3= new Scanner(System.in);
        System.out.println("3.kenarı giriniz:");
        c=veri3.nextDouble();

        double u = (a + b + c) / 2;

        double alanxalan = u * (u - a) * (u - b) * (u - c);

        double alan = Math.sqrt(alanxalan);

        System.out.print("Üçgenin Alanı: " + alan);

    }
}
