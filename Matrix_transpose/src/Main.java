public class Main
{

    public static void main(String[] args)
    {
        int[][]original={{2,3,4},{5,6,4}};
        int[][]transpose=new int[original[0].length][original.length];

        for (int i=0;i<original.length;i++)
        {
            for (int j = 0; j < original[i].length; j++)
            {
                transpose[j][i] = original[i][j];

            }
        }
            for (int[] value : transpose)
            {
                for (int item : value)
                {
                    System.out.print(item + " ");
                }
                System.out.println();
            }
        System.out.println();

    }

}

