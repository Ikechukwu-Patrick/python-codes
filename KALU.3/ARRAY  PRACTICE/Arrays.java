import java.util.Scanner;
import java.util.Arrays;

public class ArrayN{

public static int[] arrayNumber(int [] numbers){
int[] transfer = new int[numbers.length];
for(int index = 0; index<numbers.length; index++){
transfer[index] = numbers[index];
}
return transfer;
}


public static void main(String [] args){
int [] arrays = {12,43,54,65,7,8,65,34,56,644,35,7,54};
System.out.print(Array.toString(arrayNumber(arrays)));
}

}
