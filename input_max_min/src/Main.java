import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        Scanner inp= new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        int n=inp.nextInt();
        List<Integer>liste=new ArrayList<Integer>();
        for(int i=1; i<=n; i++)
        {
            System.out.println(i+". sayıyı giriniz:");
            int sayi=inp.nextInt();
            liste.add(sayi);
        }
        int Max=liste.get(1);
        int Min=liste.get(0);
        for(int i=0;i<n-1;i++){
            if(liste.get(i)<liste.get(i+1))
            {
                Min=liste.get(i);
                Max=liste.get(i+1);
            }
            else if(liste.get(i)>liste.get(i+1)){
                Min=liste.get(i+1);
                Max=liste.get(i);
            }
        }
        System.out.println("En küçük sayımız: "+Min);
        System.out.println("En büyük sayımız : "+Max);
    }
}
