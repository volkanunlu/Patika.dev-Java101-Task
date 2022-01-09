
public class Main {

    static boolean ispalindrom(int number)
    {
        int temp = number, reverse = 0, lastnumber;

        while (temp!=0)
        {
            lastnumber=temp%10; //son basamak değerini almak adına mod alma işlemi yapılıyor.
            reverse=(reverse*10)+lastnumber; //tersi yazılacak sayının ilk basamaktan itibaren matematiksel formülü uygulanarak atanıyor.
            temp/=10; //sayı sürekli ona bölünüp basamak olarak (binler/yüzler/onlar/birler olarak indirgeniyor.)

        }

        if (number == reverse)
            return true;
        else
            return false;


    }


    public static void main(String[] args) {
        System.out.println(ispalindrom(101));
        System.out.println(ispalindrom(432));
        System.out.println(ispalindrom(8668));
        System.out.println(ispalindrom(221));


    }
}
