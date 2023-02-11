import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int A = Integer.parseInt(br.readLine()
        );
        int B = Integer.parseInt(br.readLine()
        );
        int C = Integer.parseInt(br.readLine()
        );
        int i = 1;
        int cost = A + B *i;
        if (B >= C)
        { System.out.println(-1);}


        else {
            while (true) {

                if (C * i > cost) {
                    System.out.println(i);
                    break;
                }
                i++;


            }

        }
    }
}
