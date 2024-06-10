import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ch = 65; // or char ch = 65;  or ch = 'A';
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print((char)ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}


/*
  Output

n = 5

  A
  B C
  D E F
  G H I J
  K L M N O

 */

