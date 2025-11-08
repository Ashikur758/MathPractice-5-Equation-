import java.util.Scanner;

public class MathPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b, theta, height;
        double P, r, t, A;
        double x, y, rPolar, thetaPolar;
        double x1, y1, x2, y2, distance;
        double a, bQuad, c, discriminant, root1, root2;

        // Equation 1
        System.out.println("Equation 1: Calculate the height of a right triangle.");
        System.out.print("Enter base (b): ");
        b = sc.nextDouble();
        System.out.print("Enter angle (theta in degrees): ");
        theta = sc.nextDouble();
        height = b * Math.tan(Math.toRadians(theta));
        System.out.println("Height: " + height);

        // Equation 2
        System.out.println("\nEquation 2: Compound Interest Calculation.");
        System.out.print("Enter Principal (P): ");
        P = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate (r as decimal, e.g., 0.05): ");
        r = sc.nextDouble();
        System.out.print("Enter Number of Compounds per Year (n): ");
        int n = sc.nextInt();
        System.out.print("Enter Time in Years (t): ");
        t = sc.nextDouble();
        A = P * Math.pow(1 + r / n, n * t);
        System.out.println("Total Amount: " + A);

        // Equation 3
        System.out.println("\nEquation 3: Convert Cartesian to Polar Coordinates.");
        System.out.print("Enter x: ");
        x = sc.nextDouble();
        System.out.print("Enter y: ");
        y = sc.nextDouble();
        rPolar = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        thetaPolar = Math.toDegrees(Math.atan2(y, x));
        System.out.println("Radius: " + rPolar + ", Angle: " + thetaPolar + "°");

        // Equation 4
        System.out.println("\nEquation 4: Calculate Distance Between Two Points.");
        System.out.print("Enter x1: ");
        x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        y2 = sc.nextDouble();
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + distance);

        // Equation 5
        System.out.println("\nEquation 5: Solve Quadratic Equation.");
        System.out.print("Enter coefficient a: ");
        a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        bQuad = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        c = sc.nextDouble();
        discriminant = Math.pow(bQuad, 2) - 4 * a * c;
        if (discriminant >= 0) {
            root1 = (-bQuad + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-bQuad - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
            if (root1 >= 0 && root2 >= 0)
                System.out.println("Smallest positive root: " + Math.min(root1, root2));
            else if (root1 >= 0)
                System.out.println("Smallest positive root: " + root1);
            else if (root2 >= 0)
                System.out.println("Smallest positive root: " + root2);
            else
                System.out.println("No positive roots.");
        } else {
            System.out.println("No real roots.");
        }

        sc.close();
    }
}
