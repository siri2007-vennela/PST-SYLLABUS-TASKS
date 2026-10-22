import java.util.*;
import java.util.stream.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, List<Integer>> data = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int temp = sc.nextInt();

            if (temp > 50) {
                data.computeIfAbsent(id, k -> new ArrayList<>()).add(temp);
            }
        }

        data.entrySet().stream()
            .map(e -> new AbstractMap.SimpleEntry<>(
                e.getKey(),
                e.getValue().stream().mapToInt(Integer::intValue).average().orElse(0)
            ))
            .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
            .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        sc.close();
    }
}