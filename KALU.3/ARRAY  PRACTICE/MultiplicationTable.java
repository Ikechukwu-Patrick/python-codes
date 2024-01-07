public class MultiplicationTable {

public static void main(String [] args) {

System.out.println("           Multiplication Table");

 
 for (int j = 1; j <= 12; j++)
 System.out.print(" " + j);

 System.out.println("\n-----------------------------------------------------");

// Display table body
 for (int i = 1; i <= 12; i++) {
 System.out.print(i + "   ");
 for (int j = 1; j <= 12; j++) {
 // Display the product and align properly
 System.out.printf("%4d", i * j);
 }
 System.out.println();
 }
 }
 }

