import java.util.Scanner;

public class RandomNumber {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);


int Counter = 1;

while(Counter != -1){


int num1 = (int)(Math.random() * 500);
int num2 = (int)(Math.random() * 500);
int num3 = (int)(Math.random() * 500);
int num4 = (int)(Math.random() * 500);
int num5 = (int)(Math.random() * 500);
int num6 = (int)(Math.random() * 500);




	if(num1 < num2){
	int temp = num1;
	num1 = num2;
	num2 = temp;
	}
	if(num3 < num4){
	int temp = num3;
	num3 = num4;
	num4 = temp;
	}
	if(num5 < num6){
	int temp = num5;
	num5 = num6;
	num6 = temp;
	}
	System.out.print("What is  " + num1 + " * " + num2 +  " ? "  );

	int answer1 = input.nextInt();

	while(num1 * num2 != answer1){
	System.out.print("Wrong. What is  " + num1 + " * " + num2 +  " ? "  );

	int answer1 = input.nextInt();
	
	}


	else if{ 
	System.out.println("Your answer is wrong.");
	System.out.println(num1 + " * " + num2 + " is " + (num1 * num2));
	System.out.print("What is " + num3 + " + " + num4 + " ? ");
	int answer2 = input.nextInt();
	
	if(num3 + num4 == answer2){
	System.out.println("You are correct");
	}

	else{
	System.out.println("Your answer is wrong.");
	System.out.println(num3 + " * " + num4 + " is " + (num3 * num4));

	System.out.print("What is " + num5 + " - " + num6 + " ? ");
	int answer3 = input.nextInt();

	if(num5 - num6 == answer3){
	System.out.println("You are correct");
	}
	else{
	System.out.println("You are wrong ");
	System.out.println(num5 + " - "  + num6 + " is " + (num5 - num6));
	System.out.println("Do you wish to end program, if yes press -1 or if no press 2 to continue quiz ");
	Counter = input.nextInt();
	System.out.println("Thank you for competing with us, see you next time");
	}
	}
       }
      }
    }

}



