import java.util.Arrays;
import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] R = new int[N];
        String[] S = new String[N];

        for (int i = 0; i < N; i++) {
            R[i] = sc.nextInt();
            S[i] = sc.nextLine();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < S[i].length(); j++) {
                for (int k = 0; k < R[i]; k++) {
                    System.out.print(S[i].charAt(j));
                }


            }
            System.out.println();
        }


    }
}
