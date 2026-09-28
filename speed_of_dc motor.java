import java.util.Scanner;

public class DCMotorSpeed {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== DC Motor Speed Calculator =====");

        System.out.print("Enter armature voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter armature current (A): ");
        double current = sc.nextDouble();

        System.out.print("Enter armature resistance (Ohm): ");
        double resistance = sc.nextDouble();

        System.out.print("Enter motor constant (k): ");
        double motorConstant = sc.nextDouble();

        System.out.print("Enter flux (Wb): ");
        double flux = sc.nextDouble();

        // Back EMF
        double backEMF = voltage - (current * resistance);

        // Speed calculation
        double speed = backEMF / (motorConstant * flux);

        System.out.println("\n----- Results -----");
        System.out.printf("Armature Voltage : %.2f V%n", voltage);
        System.out.printf("Armature Current : %.2f A%n", current);
        System.out.printf("Back EMF         : %.2f V%n", backEMF);
        System.out.printf("Motor Speed      : %.2f rad/s%n", speed);

        sc.close();
    }
}
