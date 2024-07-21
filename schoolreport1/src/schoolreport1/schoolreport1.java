package schoolreport1;
import java.util.Scanner;

public class schoolreport1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student score: ");
        int score = scanner.nextInt();

        String level;
        if (score >= 80) {
            level = "Outstanding Achievement";
        } else if (score >= 70) {
            level = "Meritorious Achievement";
        } else if (score >= 60) {
            level = "Substantial Achievement";
        } else if (score >= 50) {
            level = "Moderate Achievement";
        } else if (score >= 40) {
            level = "Adequate Achievement";
        } else if (score >= 30) {
            level = "Elementary Achievement";
        } else {
            level = "Not Achieved";
        }

        System.out.println("The level of achievement is: " + level);
    }
}


