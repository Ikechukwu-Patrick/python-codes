import java.util.Scanner;

public class TotalSum {

public static int sumNum(){

Scanner input = new Scanner(System.in);

int total = 0;
for(int counter = 1; counter <6; counter++){
	System.out.print("Enter number  " + counter + " : ");
	int num = input.nextInt();

	total += num;
}
return total;
}


public static  double  average(){
double average = sumNum() / 5;
return average;
}

public static String max(){

Scanner input = new Scanner(System.in);
System.out.print("Enter number 1: " );
int num = input.nextInt();

int Max = num; int Mini = num; double average =0; int total = num;
for(int counter = 2; counter <= 5; counter++){

System.out.print("Enter number " + counter + " : ");
num = input.nextInt();

if(num > Max){Max = num;}
if(num < Mini){Mini = num;}

total = total + num;


average = total / counter;
}
return "The total is " + total + "\n" + "The maximum is " + Max + "\n" + "The minimum is " + Mini + "\n" + "The average is " + average ;


}
}