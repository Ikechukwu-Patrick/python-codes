import java.util.Scanner;

public class MaxAndMini {

public static void main(String [] args) {
Scanner input = new Scanner(System.in);


int count = 0;
int largestNumber = 0;
int lowestNumber = 0;

for(count = 1; count <= 10; count++){
	System.out.print("Enter 10 numbers from 1 - 100: ");
	int numbers = input.nextInt();


	
	if(numbers >= largestNumber){
		largestNumber = numbers;
		System.out.println("The maximun number is " + largestNumber);
	}
	
	if(numbers <= lowestNumber){
		lowestNumber = numbers;
		System.out.print("The minimum number is " + lowestNumber);

	

}
}

}
}