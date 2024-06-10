import java.util.Scanner;

public class Pattern23 {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
        for(int i = 1;i < n; i++){

            for(int j = 0; j <n-i; j++){
                System.out.print( n - i+ " ");
            }
            System.out.println();
        }
    }
}


/*

Output
n = 5

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
 */
