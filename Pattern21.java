import java.util.Scanner;

public class Pattern21 {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i)+1;j++){
                System.out.print("  ");
            }
            int count = 1;
            for(int k = 1; k <= (2*i)-1;k++){

                if(k < i) {
                    System.out.print(count++ + " ");
                }
                else{
                    System.out.print(count-- + " ");

                }
            }
            System.out.println();
        }
    }
}


/*
Output

n = 5

                1
              1 2 1
            1 2 3 2 1
          1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
 */