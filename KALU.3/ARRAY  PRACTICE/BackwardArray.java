import java.util.Arrays;

public class BackwardArray {

public static int [] reverseNumber(int [] numbers){
int rev = numbers.length-1;
 
int [] reverse = new int  [numbers.length];

for(int index = 0; index < numbers.length; index++){
	reverse [index] = numbers[rev];
	rev --;
}

return reverse;
}

}