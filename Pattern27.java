import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int ch = 65; // or char ch = 65;  or ch = 'A';

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
  A B
  A B C
  A B C D
  A B C D E
 */