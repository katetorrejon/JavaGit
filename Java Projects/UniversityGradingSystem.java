//Gonzaga, Zion Christian B. & Torrejon, Kate U.

import java.util.Scanner;

public class UniversityGradingSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double exam, attendance, final_grade;
        boolean credit, pass;
        String letter_grade;

        System.out.print("Enter exam score [0-100]: ");
        exam = s.nextDouble();
        System.out.print("Enter number of meetings attended [0-12]: ");
        attendance = s.nextDouble();
        System.out.print("Did the student complete extra credit assignments? [true/false]: ");
        credit = s.nextBoolean();

        double exam_percent = exam*0.8;
        double attendance_percent = (attendance/12)*100*0.2;
        final_grade = exam_percent + attendance_percent;

        if (credit == true) 
            final_grade += 5;

        System.out.println("");
        System.out.printf("Exam 80%%: %.2f%n", exam_percent);
        System.out.printf("Attendance 20%%: %.2f%n", attendance_percent);
        System.out.println("");
        System.out.printf("Calculated Final Grade: %.2f%n", final_grade);
        System.out.println("");

        if (final_grade >= 60 && (exam >= 60 && attendance >= 12*0.7 || exam < 60 && credit == true && attendance >= 12*0.7 || exam > 80 && attendance >= 12*0.5)) {
            pass = true;
        } else {
            pass = false;
        }

        if (pass == true) {
            System.out.println("Student Passed.");
            if (final_grade >= 90) {
                letter_grade = "A";
            } else if (final_grade >= 80) {
                letter_grade = "B";
            } else if (final_grade >= 70) {
                letter_grade = "C";
            } else {
                letter_grade = "F";
            }
            System.out.println("Letter Grade: " + letter_grade);
        } else {
            System.out.println("Student Failed.");
        }

        s.close();
    }
}
