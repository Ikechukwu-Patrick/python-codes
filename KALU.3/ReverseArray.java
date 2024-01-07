import java.util.Arrays;
public class ReverseArray {

public static void main(String[]args) {

int [] newArray = {65,7,89,4,97,23,2,4,6,7,98,56};

int [] reverseArray = new int[newArray.length];
int opposite = newArray.length-1;

	for(int index = 0; index <= newArray.length-1; index++) {

		 reverseArray[index] = newArray[opposite];
		opposite--;
}


		

System.out.print(Arrays.toString(reverseArray));

}

} 