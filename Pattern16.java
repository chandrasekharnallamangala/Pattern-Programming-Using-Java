import java.util.Scanner;

public class Pattern16 {
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            int count = i+1;
            for(int j = 0; j <= (n-i)-1; j++){
                if(j==0 || i==0 ||  j==(n-i)-1){
                    System.out.print(count++ +" ");
                }
                else{
                    System.out.print("  ");
                    count++;
                }
            }
            System.out.println();
        }

    }
}

/*
Output

n=5

1 2 3 4 5
2     5
3   5
4 5
5
 */