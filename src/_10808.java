import java.util.Scanner;

public class _10808 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] atoz = new int[26];
        int[] atozscore = new int[26];
        for (int i = 0; i < 26; i++) {
            atozscore[i] = 0;

        }
        for (int i = 0; i < 26; i++) {
            atoz[i] = 97 + i;
            
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < word.length() ; j++) {
                if (atoz[i] == Integer.valueOf(word.charAt(j)))
                {
                    atozscore[i]++;
                }

            }
            System.out.print(atozscore[i] + " ");
        }


    }
}
