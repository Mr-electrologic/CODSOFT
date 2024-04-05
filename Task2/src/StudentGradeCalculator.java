import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSub = sc.nextInt();
        
        StudentGrades s1 = new StudentGrades(numSub);
        s1.getSubjectMarks(sc);
        s1.calculateResults();
        s1.displayResults();
        
        sc.close();
    }
}

class StudentGrades {
    private int numSub;
    private int[] marks;
    private int totalMarks;
    private double percentage;
    private char grade;
    
    public StudentGrades(int numSub) {
        this.numSub = numSub;
        marks = new int[numSub];
    }
    
    public void getSubjectMarks(Scanner scanner) {
        System.out.println("Enter marks obtained out of 100 in each subject:");
        for (int i = 0; i < numSub; i++) {
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
    }
    
    public void calculateResults() {
        percentage = (double) totalMarks / (numSub * 100) * 100;
        
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
    }
    
    public void displayResults() {
    	System.out.println("Total Subjects: "+numSub);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
