import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String p = sc.next();

        int n = t.length(), m = p.length();
        int[] lps = new int[m];

        for (int i = 1, len = 0; i < m;) {
            if (p.charAt(i) == p.charAt(len))
                lps[i++] = ++len;
            else if (len != 0)
                len = lps[len - 1];
            else
                lps[i++] = 0;
        }

        int i = 0, j = 0;
        while (i < n) {
            if (t.charAt(i) == p.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.print((i - j) + " ");
                j = lps[j - 1];
            } else if (i < n && t.charAt(i) != p.charAt(j)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }

        sc.close();
    }
}