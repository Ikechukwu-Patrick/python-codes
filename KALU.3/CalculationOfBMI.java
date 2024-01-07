import java.util.Scanner;

public class CalculationOfBMI{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds: ");
double weight = input.nextDouble();

System.out.print("Enter height in inches: ");
double height = input.nextDouble();

double weightInKilograms = weight * KILOGRAMS_PER_POUND;
double heightInKilograms = height * KILOGRAMS_PER_INCH;
//double bmi = weightInKilograms / heightInMeters * heightInMeters);

System.out.println("BMI is " + bmi);

if(bmi < 18.5){
System.out.println("BMI is " + bmi);
}
else if(bmi < 25){
System.out.println("Normal");
}
else if(bmi < 30){
System.out.println("Overweight");
}
else
System.out.println("Obese");


}
}