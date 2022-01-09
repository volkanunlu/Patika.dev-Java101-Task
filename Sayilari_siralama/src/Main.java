import java.util.Scanner;
public class Main {
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        a=inp.nextInt();
        System.out.println("Bir sayı giriniz:");
        b=inp.nextInt();
        System.out.println("Bir sayı giriniz:");
        c=inp.nextInt();

        if((a<b)&&(a<c))
        {
            if (b<c) {
            System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması a<b<c " );
            }
            else{
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması:a<c<b ");
            }
        }
        else if((c<a)&&(c<b)) {
            if (a < b) {
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: c<a<b");
            }
            else {
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: c<b<a  ");

            }
        }
        else
        if (a<c)
            {
                System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: b<a<c ");
            }
        else {
            System.out.println("Girdiğiniz sayıların küçükten büyüğe sıralaması: b<c<a   ");
        }


    }

}
