public class Main {

    static int fibonacci(int n)
    {

    if ((n==1)|| (n==2)) //ilk 2 terim 1 olduğu için bir koşul belirledik.
    {
        return 1;
    }
         return fibonacci(n-1) +fibonacci(n-2); //matematiksel denklemi

    }


    public static void main(String[] args) {

        //Fibonacci sayıları : 1 1 2 3 5 8 13 21 34 55 89...
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(2));

        //f(1)=--------------------1
        //f(2)=--------------------1
        //f(3)=f(2)+f(1)-----------2
        //f(4)=f(3)+f(2)-----------3
        //f(5)=f(4)+f(3)-----------5
        //f(6)=f(5)+f(4)-----------8
        //f(7)=f(6)+f(5)----------13
        //f(n)=  f(n-1)+f(n-2)
    }
}
