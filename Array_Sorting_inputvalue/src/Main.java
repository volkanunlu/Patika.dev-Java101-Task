import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      int [] array={15,12,788,1,-1,-778,2,0};

        int value=5;
        int min=value;
        int max=value;
        Arrays.sort(array);
        for (int i=0; i<array.length;i++)
        {
            if (value<array[i])
            {
                min=array[i-1];
                max=array[i];
                break;
            }

        }
        System.out.println(" küçük en yakın:" +min);
        System.out.println(" büyük en yakın:"+ max);


    }
}
