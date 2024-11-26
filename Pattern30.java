import java.util.Scanner;

public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }



        for (int k=0; k<n-i; k++) {

                if(k==0 || k==n-i-1 || i==0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }
}



* * * * * 
 *     * 
  *   * 
   * * 
    * 
