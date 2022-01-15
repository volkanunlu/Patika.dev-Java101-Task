import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.SortedMap;


public class Main
{

    public static void main(String[] args) {
        Random rnd=new Random();
        int number= rnd.nextInt(100); //0-100 arası değer ürettik.
        System.out.println(number);

        Scanner inp=new Scanner(System.in);

        int right=0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        while (right<5) {
            System.out.println("Lütfen bir sayı giriniz: ");
            int value = inp.nextInt();

            if (value < 0 || value > 100) {
                System.out.println("Lütfen 1-100 arası bir değer giriniz!");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {

                    isWrong = true;
                    System.out.println("Bir daha ki hatalı girişinizde hakkınızdan düşülecektir.");
                }

                continue;
            }

            if (value == number) {
                System.out.println("Doğru tahminde bulundunuz.");
                isWin = true;
                break;
            } else {
                System.out.println("Yanlış tahminde bulundunuz!");

            }
            if (value > number) {
                System.out.println("Girdiğiniz sayı gizli sayıdan büyüktür!");
            } else {
                System.out.println("Girdiğiniz sayı gizli sayıdan küçüktür.");
            }

            wrong[right++] = value;
            System.out.println("Kalan hakkı : " + (5 - right));
        }

                if (!isWin)
                {
                    System.out.println("Kaybettiniz!");
                    if (!isWrong)
                    {
                        System.out.println("Tahmin ettiğiniz sayılar : " + Arrays.toString(wrong));
                    }
                }
        }
    }
