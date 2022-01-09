import java.util.Scanner;

public class Main {

    public static void main(String[]args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number please:");
        int number=inp.nextInt();

        if (number>0)
        {
            int totalnumber = 0;

            for (int i = 1; i < number; i++)
            {
                if (number % i == 0)
                {
                    totalnumber += i;
                }
            }

            if (totalnumber == number)
            {
                System.out.println("This is a perfect number :)");
            } else
            {
                System.out.println("Sorry, this is not a perfect number :( ");
            }
        }

        else
        {

            System.out.println("This is a negative number.Try again");
        }

            }
        }
