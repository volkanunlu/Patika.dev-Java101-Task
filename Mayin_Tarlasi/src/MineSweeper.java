import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int satir;
    int sutun;
    int[][]map;
    String[][] game;
    boolean IsGameOver=false;

    MineSweeper(int satir,int sutun)
    {
        this.satir=satir;
        this.sutun=sutun;
        this.map=new int[satir][sutun];
        this.game=new String[satir][sutun];
        createGame(sutun,satir);

    }

    private void createGame(int satir,int sutun)
    {
        int mayin=(satir*sutun)/4;
        Random rnd=new Random();
        int sayac=0;
        while (sayac<mayin)
        {
            int mayinsatir=rnd.nextInt(satir);
            int mayinsutun=rnd.nextInt(sutun);
            if(this.map[mayinsatir][mayinsutun]!=1){
                this.map[mayinsatir][mayinsutun]=1;
                sayac++;
            }
        }
        for (String[] strings : game) {
            Arrays.fill(strings, "-");

        }
    }

    public void run() {
        printMap();
        Scanner scanner = new Scanner(System.in);
        while (!IsGameOver){
            printGame();
            System.out.print("Satır:");
            int inputSatir= scanner.nextInt();
            System.out.print("Sütun:");
            int inputSutun=scanner.nextInt();
            if(inputSutun>=sutun || inputSutun<0){
                System.out.println("Hatalı sütun");
                continue;
            }
            if(inputSatir>=satir || inputSatir<0){
                System.out.println("Hatalı satır");
                continue;
            }
            select(inputSatir,inputSutun);
            if(isFinished()){
                System.out.println("Tebrikler oyunu tamamlandınız");
                break;
            }
        }
        if(IsGameOver){
            System.out.println("Mayına bastın");
            printMap();
        }
    }

    private void printMap() {
        System.out.println("----- map -------");
        for(int[] i : this.map){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("----- map -------");
    }

    private void select(int i, int j){
        int sayac=0;
        if(map[i][j]==1){
            this.IsGameOver=true;
        }
        else {
            for (int k = i-1; k <=i+1 ; k++) {
                for (int l = j-1; l <=j+1 ; l++) {
                    if(k==i && l==j){
                        continue;
                    }
                    try {
                        sayac+=map[k][l];
                    }catch (Exception ignored){

                    }
                }
            }



        }

        this.game[i][j]=String.valueOf(sayac);
    }

    private void printGame(){
        System.out.println("-------------");
        for(String[] i : this.game){
            for(String j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
    private boolean isFinished(){
        boolean isEmpty=true;
        for(int i= 0; i<game.length;i++){
            for(int j=0; j<game[i].length;j++){
                if (Objects.equals(game[i][j], "-") && map[i][j]==0 ) {
                    isEmpty = false;
                    break;
                }
            }
        }
        return isEmpty;
    }
}




