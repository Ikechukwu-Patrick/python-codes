import java.util.Scanner;

public class ThreeIntegers {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print(" Enter first three digit number ");
int firstNumber = input.nextInt();
 
System.out.print("Enter second three digit number ");
int secondNumber = input.nextInt();

System.out.print(" Enter third three digit number ");
int thirdNumber = input.nextInt();

if(firstNumber > secondNumber && secondNumber > thirdNumber){
          System.out.printf("%d %d %d",thirdNumber, secondNumber, firstNumber);
}

if(firstNumber > thirdNumber && thirdNumber > secondNumber){
System.out.printf("%d %d %d",secondNumber, thirdNumber, firstNumber);
}


if(secondNumber > firstNumber && firstNumber > thirdNumber) {          
      System.out.printf("%d %d %d", thirdNumber, firstNumber, secondNumber);
}

if(secondNumber >thirdNumber && thirdNumber > firstNumber) {
System.out.printf("%d %d %d",firstNumber, thirdNumber, secondNumber);
}

if(thirdNumber > firstNumber && firstNumber > secondNumber) {
System.out.printf("%d %d %d",secondNumber, firstNumber, thirdNumber);
}

if(thirdNumber > secondNumber && secondNumber > firstNumber) {
System.out.printf("%d %d %d",firstNumber, secondNumber, thirdNumber);
}
















}
}