public class Main {
    public static void main(String[] args) {
        // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        int [] array={1 ,2 ,3 ,4 ,5};
        double total=0.0;
        for (double i:array)
        {
            total+=(1.0/i);

        }
        System.out.println(array.length/total);

    }
}
