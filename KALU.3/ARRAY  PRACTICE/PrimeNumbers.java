import java.util.Scanner;

public class PrimeNumbers {

public static void main(String [] args) {

Scanner input = new Scanner(System.in);

int num = input.nextInt();

if(num % 2 != 0){
System.out.println(num + " is a prime number ");
}
else{
System.out.println(num + " is not a prime number ");
}

}
}