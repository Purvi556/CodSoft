import java.util.Scanner;

public class StudentGradeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in Subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        double averagePercentage = (totalMarks / (numSubjects * 100)) * 100;

        char grade = calculateGrade(averagePercentage);

        System.out.println("\nAverage Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    // Calculate the grade based on average percentage
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
