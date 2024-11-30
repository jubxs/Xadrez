import java.util.Scanner;

public class xadrez {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int L = in.nextInt();
       int C = in.nextInt();
       int LC;
       int CC;
       if (L % 2 == 0){
           LC = 0;
       } else {
           LC =1;
       }

        if (C % 2 == 0){
            CC = 0;
        } else {
            CC =1;
        }

        if(LC==0 && CC==0){
            System.out.println("1");
        } else if (LC==1 && CC==1) {
            System.out.println("1");
        }

        if (LC==0 && CC == 1){
            System.out.println("0");
        } else if (LC==1 && CC==0) {
            System.out.println("0");
        }



    }
}