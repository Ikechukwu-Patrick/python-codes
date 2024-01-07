public class Largest {

public static void main(String[]args) {

int [] newArray = {34,31,2,64,23,65,87,45,36};

int largest = newArray [0];

	for (int index = 0; index <= newArray.length-1; index++){
 	if (newArray [index] > largest) {
		largest = newArray[index] ;}

     }  



System.out.println("The Largest element is  " + largest); 

}

}