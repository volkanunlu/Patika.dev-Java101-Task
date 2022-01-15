import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
       /* Scanner inp=new Scanner(System.in);*/   //Kullanıcı tarafından değer girilerek karşılaştırma yapılmak istenirse kodları aktifleştirebilirsiniz.
//        System.out.println("Lütfen bir kelime giriniz:");
//        String value=inp.nextLine();
//        System.out.println(isPalindrome(value));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abbas"));
        System.out.println(isPalindrome("kayak"));



    }
}