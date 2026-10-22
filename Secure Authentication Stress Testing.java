import java.util.*;

public class Main {

    static boolean login(String username, String password) {
        if (username == null || password == null)
            return false;

        if (username.length() < 3 || username.length() > 20 ||
            password.length() < 6 || password.length() > 20)
            return false;

        return username.equals("admin") && password.equals("admin123");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();

            try {
                System.out.println(login(username, password)
                        ? "SUCCESS" : "FAILURE");
            } catch (Exception e) {
                System.out.println("FAILURE");
            }
        }

        sc.close();
    }
}