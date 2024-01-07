import java.util.Scanner;

public class ClassAverage {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

int total = 0;

int gradeCounter = 1;

while(gradeCounter <= 4) {
	System.out.print("Enter grade:  ");
	int grade = input.nextInt();
	

	total = total + grade;
	gradeCounter = gradeCounter + 1;
}
int average = total / 4 ;
	  
    System.out.println("Total of all grades is " + total);
    System.out.println("The average class  is " + average); 











}
}