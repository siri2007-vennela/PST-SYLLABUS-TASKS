import java.util.*;

class ParkingLot {
    int capacity;
    int parked = 0;

    ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    void parkVehicle() {
        if (parked < capacity) {
            parked++;
            System.out.println("Vehicle Parked Successfully");
        } else {
            System.out.println("Parking Full");
        }
    }

    void removeVehicle() {
        if (parked > 0) {
            parked--;
            System.out.println("Vehicle Removed Successfully");
        } else {
            System.out.println("Parking Lot Empty");
        }
    }

    void displayStatus() {
        System.out.println("Available Slots: " + (capacity - parked));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        int n = sc.nextInt();

        ParkingLot lot = new ParkingLot(capacity);

        for (int i = 0; i < n; i++) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lot.parkVehicle();
                    break;
                case 2:
                    lot.removeVehicle();
                    break;
                case 3:
                    lot.displayStatus();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}