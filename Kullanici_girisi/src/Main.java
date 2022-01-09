import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String username, password, iusername, ipassword;

        int karar;
        iusername = "Deneme";
        ipassword = "12345";
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı giriniz:");
        username = inp.nextLine();
        System.out.println("Şifreniz:");
        password = inp.nextLine();

        if (ipassword != password) {
            System.out.println("Yanlış şifre girdiniz.Şifrenizi yenilemek ister misiniz?\n1-Evet\n2-Hayır");
            karar = inp.nextInt();

            if (karar == 1) {
                System.out.println("Yeni şifrenizi oluşturunuz.");
                Scanner inp2 = new Scanner(System.in);
                password = inp2.nextLine();

                if (password == ipassword) {


                    System.out.println("Yeni şifreniz oluşturuldu. Şifreniz: " + password);

                }
                else
                {
                    System.out.println("Bu şifre eski bir şifredir.Lütfen yeni bir şifre giriniz.");
                    Scanner inp3 = new Scanner(System.in);
                    password = inp3.nextLine();
                    System.out.println("Yeni şifreniz:" +password);

                }
            }
            else {
                System.out.println("Hatalı giriş yaptınız.İşlem sonlandırıldı.");

            }
        }

        else

        {
                System.out.println("Şifreniz doğru.");
        }
        }
    }

