import java.util.Scanner;

public class Pattern12 {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-1)-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                if(k == 0 || k == i || i == n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*

Output

n = 5

    *
   * *
  *   *
 *     *
* * * * *

 */