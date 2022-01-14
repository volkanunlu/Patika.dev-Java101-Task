import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.println("Dizi boyutunu giriniz:");
        int size=inp.nextInt();
        int[]array=new int[size]; //dizi boyutunu kullanıcıdan aldık.



        for (int i=0; i<array.length;i++)    //dizi boyutu kadar sayı girmesini kullanıcıdan istedik.
        {
            System.out.println("Lütfen sayınızı giriniz:");
            int deger=inp.nextInt();
            array[i]=deger;  //girilen değeri indeks sırasına göre diziye atadık.

        }
        Arrays.sort(array); //diziyi sıraladık.
        System.out.println(Arrays.toString(array)); //Ekrana basmak adına Stringe dönüştürdük.


        }

    }

