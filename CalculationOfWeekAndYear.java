import java.util.Scanner;

public class CalculationOfWeekAndYear {

public static void main(String[]args) { 

Scanner input = new Scanner(System.in);

System.out.print("Enter a year ");
int year = input.nextInt();


System.out.print("Enter month eg 1 to 12; ");
int month = input.nextInt();


System.out.print("Enter day of the month eg 1 to 31; ");
int day = input.nextInt();


 int century = year/100; 

int yearOfTheCentury = year % 100;

int daysOfTheWeek = (day + 26*(month + 1)/10 + yearOfTheCentury  + (yearOfTheCentury/4) + (century/4) + (5 * century) ) % 7;

if (daysOfTheWeek ==0)System.out.print("The days of the week is Saturday");
if (daysOfTheWeek ==1)System.out.print("The days of the week is Sunday");
if (daysOfTheWeek ==2)System.out.print("The days of the week is Monday");
if (daysOfTheWeek ==3)System.out.print("The days of the week is Tuesday");
if (daysOfTheWeek ==4)System.out.print("The days of the week is Wednesday");
if (daysOfTheWeek ==5)System.out.print("The days of the week is Thursday");
if (daysOfTheWeek ==6)System.out.print("The days of the week is Friday");



}
}