import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        salaries.stream()
                .map(s -> (int)(s * 1.10))
                .forEach(s -> System.out.print(s + " "));
        
        sc.close();
    }
}