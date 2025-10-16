import java.util.Scanner;

public class AGOSTO_CC00223_Methods2 {

    static void displayStudentInfo(String name, String subject, int grade) {
        System.out.println("====================");
        System.out.println("Student name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Grade: " + grade + "%");
        System.out.println("====================");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter student's subject: ");
        String subject = input.nextLine();

        System.out.print("Enter the student's grade: ");
        int grade = input.nextInt();

        displayStudentInfo(name, subject, grade);

        input.close();
    }
}
