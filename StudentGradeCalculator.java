import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        long rollNumber = sc.nextLong();

        System.out.print("Enter Marks of Subject 1 (out of 100): ");
        double sub1 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 2 (out of 100): ");
        double sub2 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 3 (out of 100): ");
        double sub3 = sc.nextDouble();

        double total = sub1 + sub2 + sub3;
        double percentage = total / 3;

        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n----- Student Report -----");
        System.out.println("Name         : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Subject 1    : " + sub1);
        System.out.println("Subject 2    : " + sub2);
        System.out.println("Subject 3    : " + sub3);
        System.out.println("Total Marks  : " + total);
        System.out.printf("Percentage   : %.2f%%\n", percentage);
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}
