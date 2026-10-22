import java.util.*;

class Vehicle {
    double calculateFare(double distance) {
        return 0;
    }
}

class Bike extends Vehicle {
    double calculateFare(double distance) {
        return distance * 5;
    }
}

class Auto extends Vehicle {
    double calculateFare(double distance) {
        return distance * 12;
    }
}

class Cab extends Vehicle {
    double calculateFare(double distance) {
        return distance * 12;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();

            try {
                if (distance <= 0)
                    throw new IllegalArgumentException();

                Vehicle v;

                switch (type) {
                    case "Bike":
                        v = new Bike();
                        break;
                    case "Auto":
                        v = new Auto();
                        break;
                    case "Cab":
                        v = new Cab();
                        break;
                    default:
                        throw new IllegalArgumentException();
                }

                System.out.println((int) v.calculateFare(distance));

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Booking");
            }
        }

        sc.close();
    }
}