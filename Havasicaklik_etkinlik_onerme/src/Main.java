import java.util.Scanner;
public class Main {

    public static void main(String[]args)
    {
        int sicaklik;
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sıcaklık değeri giriniz:");
        sicaklik=inp.nextInt();

        if(sicaklik<5)
        {
            System.out.println("Kayak yapmalık bir hava! Hadi kaymaya gidelim!");
        }
        else if (sicaklik>=5 && sicaklik<=15)
        {
            System.out.println("Sinemanın tam zamanı! Mısırları patlatıyorum!");
        }
        else if (sicaklik>=15 && sicaklik<=25)
        {
            System.out.println("Millet ne duruyoruz! Piknik zamanı!");
        }
        else
        {
            System.out.println("Yüzmek için ne harika bir gün!");
        }


    }
}
