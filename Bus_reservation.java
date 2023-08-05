import java.util.*;

public class Bus_reservation {
    static Scanner s = new Scanner(System.in);
    static int seat[] = new int[11];

    public static void main(String[] args) {
        System.out.println("welcome to ABC transportation ");
        while (true) {
            System.out.println("please select an option: ");
            System.out.println("1.view available seats");
            System.out.println("2. Resrve a seat");
            System.out.println("3. Exit");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    displayseats();
                    break;
                case 2:
                    reserveseat();
                    break;
                case 3:
                    System.out.println("Thank you for using ABC transpotion");
                    System.exit(0);

            }
        }
    }

    public static void displayseats() {
        System.out.println("Seats: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("seat " + i + " : " + (seat[i] == 0 ? "Available" : "Reserved"));
        }
    }

    public static void reserveseat() {
        System.out.println("enter seat number to reserve: ");
        int seats = s.nextInt();
        if (seat[seats] == 0) {
            seat[seats] = 1;
            System.out.println("seat " + seats + " reserved successfully");
        } else {
            System.out.println("seat " + seats + " is already reserved");
        }
    }

}
