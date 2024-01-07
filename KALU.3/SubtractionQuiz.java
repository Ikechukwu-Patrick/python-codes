public class SubtractionQuiz {

public static void main(String[]args) {

int NumberOfQuestions = 5;

int correctCount = 0;

int count = 0;

long startTime = System.currentTimeMillis();

String output = " ";

Scanner input = new Scanner(System.in);

while(count < NumberOfQuestions) {
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);

	System.out.println("What is " + number1 + " - " + number2 + " ? ");
	int answer = input.nextInt();

 	if(number1 - number2 == answer) {
	System.out.println("You are correct! ");
	correctCount++;
}

	//else{
	//System.out.println("Your answer is wrong .\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
	//count++;
	
	//output += "\n" + number1 + " - " + number2 + " = " + answer +;

	//((number1 - number2 == answer) ? " correct " : " wrong ");
	

	 //long endTime = System.currentTimeMillis();
	//int long testTime = endTime - startTime;

//System.out.println("Correct count is " + correctCount + " \n Test time is " + testTest / 1000 + " seconds\n " + output);
			 					


