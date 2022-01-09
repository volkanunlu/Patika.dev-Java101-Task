import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
 //C(n,r)=n!/(r!*(n-r)! işlemi yani n'in r'li kombinasyonunu hesaplayacağız.

        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:\n");
        int n=inp.nextInt();
        int total=1;
        int total2=1;
        int total3=1;

        for (int i=1; i<=n; i++)
        {
            total=total*i;   //n faktöriyel hesaplanıyor
        }

        System.out.println("Lütfen bir sayı giriniz:\n");
        int p=inp.nextInt();
        for(int j=1;j<=p;p++)
        {
            total2=total2*j; //r faktöriyel hesaplanıyor.
        }

        int sayi=n-p;

        for (int l=1; l<=sayi; l++)
        {
            total3=total3*l;  //n-p faktöriyel değeri hesaplanıyor.
        }

        int sonuc=total/(total2*(total3)); //verilen formül yerine konulup işlemler gerçekleştiriliyor.

        System.out.println("İşlem sonucunuz :" +sonuc);



    }
}
