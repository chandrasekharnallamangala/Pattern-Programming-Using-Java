import java.util.Scanner;

public class Pattern6 {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int count = i;
            for(int j = 0; j < n; j++){

                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}


/*

Output

n = 5

1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
 */