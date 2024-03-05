
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueEntering = true;

        while (continueEntering) {
            System.out.println("Enter student ID:");
            String studentID = scanner.nextLine();
            System.out.println("Enter student name:");
            String studentName = scanner.nextLine();
            System.out.println("Enter the number of extra activities:");
            int numExtraActivities = scanner.nextInt();
            scanner.nextLine(); 
            // Consume the newline left after the integer input
            Student student = new Student(studentID, studentName, numExtraActivities);
            student.addExtraActivity();

            System.out.println(student);

            System.out.println("Do you want to enter details for another student? (yes/no)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("no")) {
                continueEntering = false;
            }
        }

        scanner.close();
    }





}
