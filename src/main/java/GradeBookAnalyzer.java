import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO 1: Ask how many students and read the number
        System.out.print("How many students do you want to enter? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();

        // TODO 2: Use for loop with range (i from 0 to numStudents-1)
        //       - Ask name
        //       - Ask grade with validation (if <0 or >100, ask again)
        //       - Add to the two ArrayLists

        for (int i = 0; i < numStudents; i++) {
            // Your code here...
        }

        // TODO 3: Display the full student list using for loop with range
        System.out.println("\n--- Student List ---");
        // Your code here...

        // TODO 4: Analysis Section
        System.out.println("\n--- Analysis ---");

        // a) Total students
        System.out.println("Total students     : " + /* your code */);

        // b) Class average
        double sum = 0;
        // Use for loop to calculate sum, then average
        // Your code here...
        System.out.printf("Class average      : %.2f%n", /* average */);

        // c) Passed and Failed (grade >= 60)
        int passed = 0;
        int failed = 0;
        // Use for loop + if
        // Your code here...
        System.out.println("Passed             : " + passed);
        System.out.println("Failed             : " + failed);

        // d) Highest and Lowest grade + name(s)
        // Use for loop + if
        // Your code here...

        // e) Grade Distribution (A, B, C, D, F)
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
        // Use for loop + if/else if
        // Your code here...

        System.out.println("\nGrade Distribution:");
        System.out.println("A : " + countA);
        System.out.println("B : " + countB);
        System.out.println("C : " + countC);
        System.out.println("D : " + countD);
        System.out.println("F : " + countF);

        scanner.close();
    }
}
