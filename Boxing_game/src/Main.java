public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Hasan",15,120,100,40,50);
        Fighter f2=new Fighter("Tyler",20,115,85,30,50);

        Match match=new Match(f1,f2, 85,100 );
        match.start();





    }



}
