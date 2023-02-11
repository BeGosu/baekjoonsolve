import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;


        int N = sc.nextInt();
        String B = sc.next();
         int Ntoint = 0;
        for (int i = 0; i < N; i++) {
           Ntoint =  Ntoint + (Integer.valueOf(B.charAt(i))-48);



        }
        System.out.println(Ntoint);



    }
}
