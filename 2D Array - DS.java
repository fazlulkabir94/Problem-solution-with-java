import java.util.Scanner;

public class DogSound {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[6][6];
        int sum = 0;
        
        for(int i = 0; i< 6; i++)
            for (int j = 0; j< 6; j++)
                A[i][j] = input.nextInt();

        for (int i =0; i< 4; i++) {

            for (int j =0; j< 4; j++) {
                int a = A[i][j] + A[i][j+1] + A[i][j+2];
                int b = A[i+1][j+1];
                int c = A[i+2][j] + A[i+2][j+1] + A[i+2][j+2];

                if ((a + b + c)> sum){
                    sum = (a +b +c);
                }
            }
        }

        System.out.printf("%d",sum);

    }
}
