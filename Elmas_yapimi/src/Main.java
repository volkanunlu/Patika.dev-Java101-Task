import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n; i++) {  //kaç satır olacak.
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" "); //ne kadar boşluk olacak.
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*"); //yıldız kaç tane olacak.
            }
            System.out.println(" ");
        }
        //alt kısım yapımı

        for (int i = n; i > 0; i--) {
            for (int j = (n - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = (2 * i +1); j > 1; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }}