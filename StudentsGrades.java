import java.util.Scanner;

public class StudentsGrades{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Array to store marks for each subject
        int[] marks = new int[numSubjects];

        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];  // Sum up the total marks
        }

        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Calculate the grade based on average percentage
        char grade;
        if (averagePercentage >= 95) {
            grade = 'A';
        } else if (averagePercentage >= 83) {
            grade = 'B';
        } else if (averagePercentage >= 72) {
            grade = 'C';
        } else if (averagePercentage >= 61) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    
    
    }}
