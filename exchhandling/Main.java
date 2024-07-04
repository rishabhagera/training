package exchhandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of subjects: ");
            int numberOfSubjects = scanner.nextInt();

            int[] marks = new int[numberOfSubjects];

            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            // Validate marks
            if (student.validateMarks(marks)) {
                // Calculate percentage
                float percentage = student.calculatePercentage(marks);
                System.out.println("Percentage: " + percentage + "%");
            }
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
