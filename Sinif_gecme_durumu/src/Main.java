import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int mat,fizik,turkce,kimya,muzik;
        double ortalama;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        mat=inp.nextInt();
        mat=(mat>100 || mat<0) ?0:mat;

        System.out.println("Türkçe notunuzu giriniz:");
        turkce=inp.nextInt();
        turkce=(turkce>100 || turkce<0) ?0:turkce;
        System.out.println("Fizik notunuzu giriniz:");
        fizik=inp.nextInt();
        fizik=(fizik>100 || fizik<0) ?0:fizik;
        System.out.println("Kimya notunuzu giriniz:");
        kimya=inp.nextInt();
        kimya=(kimya>100 || kimya<0) ?0:kimya;
        System.out.println("Müzik notunuzu giriniz:");
        muzik=inp.nextInt();
        muzik=(muzik>100 || muzik<0) ?0:muzik;

        ortalama=(mat+fizik+kimya+muzik+turkce)/5;

        if(ortalama<55)
        {
            System.out.println("Sınıfta kaldınız.Seneye görüşmek üzere.");
        }

        else {
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız:" +ortalama);
    }
}

