import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ch = 65;
        for(int i = 1; i <= n; i++){
            if( i % 2 != 0 ) {
                for(int j = 0; j < i; j++){
                    System.out.print((char)ch++ +" ");
                }
            }
            if(i % 2 == 0){
                int c = ch+i-1;
                for(int j = 0; j < i; j++){

                    System.out.print((char)c-- + " ");
                    ch++;
                }
            }
            System.out.println();
        }

    }
}


/*
   Output

   n = 5

   A
   C B
   D E F
   J I H G
   K L M N O

 */
