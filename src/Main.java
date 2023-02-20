import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter the overall score:");
        Scanner input = new Scanner(System.in);
        double grade = input.nextDouble();

        if (100.0 > grade && grade >= 90.0) {
            System.out.println("score: " + grade + "  Grade: AA" + "  State: Passed");
        }
        else if (90.0 > grade && grade >= 85.0) {
            System.out.println("score: " + grade + "  Grade: AB" + "  State: Passed");
        }
        else if (85.0 > grade && grade >= 80.0) {
            System.out.println("score: " + grade + "  Grade: BA" + "  State: Passed");
        }
        else if (80.0 > grade && grade >= 75.0) {
            System.out.println("score: " + grade + "  Grade: BB" + "  State: Passed");
        }
        else if (75.0 > grade && grade >= 70.0) {
            System.out.println("score: " + grade + "  Grade: CB" + "  State: Passed");
        }
        else if (70.0 > grade && grade >= 65.0) {
            System.out.println("score: " + grade + "  Grade: CC" + "  State: Passed");
        }
        else if (65.0 > grade && grade >= 60.0) {
            System.out.println("score: " + grade + "  Grade: DC" + "  State: Passed");
        }
        else if (60.0 > grade && grade >= 50.0) {
            System.out.println("score: " + grade + "  Grade: DD" + "  State: Passed");
        }
        else if (50.0 > grade && grade >= 0.0) {
            System.out.println("score: " + grade + "  Grade: FF" + "  State: Failed");
        }
        else{
            System.out.println("Invalid score, program terminates");
        }

    }
}