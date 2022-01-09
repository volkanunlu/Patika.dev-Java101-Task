import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        int gun,ay;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen gün 1-31 arası gün giriniz:");
        gun=inp.nextInt();
        System.out.println("Lütfen ay bilginizi 1-12 olacak şekilde giriniz:");
        ay=inp.nextInt();

        if((ay==3 && gun>20)||(ay==4 && gun<21))
        {
            System.out.println("Burcunuz Koç burcudur.");
        }
        else if((ay==4 && gun>20)||(ay==5 && gun<22) ) {
            System.out.println("Burcunuz Boğa burcudur.");

        }
        else if ((ay==5 && gun>21)||(ay==6 && gun<23)){
            System.out.println("Burcunuz ikizler burcudur.");
        }
        else if ((ay==6 && gun>22)||(ay==7 && gun<23)){

            System.out.println("Burcunuz Yengeç burcudur.");
        }
        else if ((ay==7 && gun>22)||(ay==8 && gun<23)){

            System.out.println("Burcunuz Aslan burcudur.");
        }
        else if ((ay==8 && gun>22)||(ay==9 && gun<23))
        {
            System.out.println("Burcunuz Başak burcudur.");
        }
        else if ((ay==9 && gun>22)||(ay==10 && gun<23))
        {
            System.out.println("Burcunuz Terazi burcudur.");
        }
        else if ((ay==10 && gun>22)||(ay==11 && gun<22))
        {
            System.out.println("Burcunuz Akrep Burcudur.");
        }
        else if ((ay==11 && gun>21)||(ay==12 && gun<22)){

            System.out.println("Burcunuz Yay burcudur.");
        }
        else if ((ay==12 && gun>21)||(ay==1 && gun<22))
        {
            System.out.println("Burcunuz Oğlak burcudur.");
        }
        else if ((ay==1 && gun>21)||(ay==2 && gun<20))
        {
            System.out.println("Burcunuz Kova burcudur.");
        }
        else if ((ay==2 && gun>19)||(ay==3 && gun<21))
        {
            System.out.println("Burcunuz Balık burcudur.");
        }
        else {
            System.out.println("Eksik ya da hatalı bir giriş yaptınız.");
        }

    }
}
