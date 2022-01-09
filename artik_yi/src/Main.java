import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        int yil;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen 4 haneli bir yıl giriniz.");
        yil=inp.nextInt();

        if ((yil%4==0))
        {
            if ((yil%100==0))
            {
                if (yil%400==0)
                {
                    System.out.println("Girdiğiniz yıl bir artık yıldır.!");
                }
                else
                {
                    System.out.println("Girdiğiniz yıl bir artık yıl değildir.!");
                }
            }
            else {
                System.out.println("Girdiğiniz yıl bir artık yıldır.!");
            }
        }
        else
        {
            System.out.println("Girdiğiniz yıl bir artık yıl değildir.!");
        }

        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.print(i + j);
            }
        }
        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }


    }

}
