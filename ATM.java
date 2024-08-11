package ATMMachine;

import java.util.Scanner;

class ATM {

    float balance;
    int pin = 5674;

    public void validatePin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == pin) {
            System.out.println("Access granted. You may proceed.");
        } else {
            System.out.println("Invalid pin. Please try again.");
        }
        sc.close(); // Closing the scanner
    }

    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.validatePin();
    }
}
