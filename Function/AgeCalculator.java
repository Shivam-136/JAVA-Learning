import java.util.Scanner;

public class AgeCalculator {

    static int calculateAge(int birthYear, int currentYear) {
        return currentYear - birthYear;
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Birth Year: ");
            int birthYear = sc.nextInt();

            System.out.print("Enter Current Year: ");
            int currentYear = sc.nextInt();

            int age = calculateAge(birthYear, currentYear);

            System.out.println("Your Age is: " + age + " years");
        }
    }
}