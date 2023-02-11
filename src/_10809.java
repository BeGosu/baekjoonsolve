import java.util.Scanner;

public class _10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int[] atoz = new int[26];
        for (int i = 0; i < 26; i++) {
            atoz[i] = 97 +i;
        }

        int[] atozscore = new int[26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (atoz[i] == word.charAt(j))
                {
                    atozscore[i] = j;
                    j = word.length();
                }
                else
                {
                    atozscore[i] = -1;
                }
            }
            System.out.print(atozscore[i]+ " ");
        }
    }
}
