import java.util.Scanner;
public class Main {

    static void power()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen Taban değerini giriniz:");
        int taban=inp.nextInt();
        System.out.println("Lütfen üs değerini giriniz:");
        int us=inp.nextInt();
        if (us==0) {
            int sonuc = 1;
        }
        int sonuc=1;
        for(int i=0; i<us; i++)
        {
            sonuc*=taban;
        }
        System.out.println("Sonuç : " + sonuc);


    }

    public static void main(String[] args) {

        power();
    }
}
