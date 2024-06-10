import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int count = (i*(i+1))/2;
            for (int j = 1; j <= (2 * i)-1 ; j++){
                if(j % 2 == 0){
                    System.out.print("* ");

                }
                else {
                    System.out.print(count-- +" "); // or use count-j+1
                }
            }
            System.out.println();
        }

        /* output

            n = 5;

            1
            3 * 2
            6 * 5 * 4
            10 * 9 * 8 * 7
            15 * 14 * 13 * 12 * 11
         */
    }
}
