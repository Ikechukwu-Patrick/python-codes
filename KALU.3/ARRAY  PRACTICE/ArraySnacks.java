import java.util.Arrays;

public class ArraySnacks {

public static int largestElement(int [] numbers){
int largest = 0;
for(int index = 0; index < numbers.length; index++){
	if(numbers[index] > largest){largest = numbers[index];}
}
return largest;
}

public static int [] reverseArray(int [] numbers){
int rev = numbers.length-1;
 
int [] reverse = new int  [numbers.length];

for(int index = 0; index < numbers.length; index++){
	reverse [index] = numbers[rev];
	rev --;
}

return reverse;
}

public static boolean checkElement(int [] numbers, int 
element){
boolean el = false;
for(int index = 0; index < numbers.length; index++){
	if(numbers[index]==element){return true;}
}
return el;

}

public static int [] oddPosition(int [] numbers){
 
int [] odd = new int  [(numbers.length )/2];
int odds = 0;

for(int index = 1; index < numbers.length; index+=2){
	odd [odds] = numbers[index]; odds++;
}

return odd;
}

public static int [] evenPosition(int [] numbers){
 
int [] even = new int  [(numbers.length +1 )/2];
int evens = 0;

for(int index = 0; index < numbers.length; index+=2){
	even [evens] = numbers[index]; evens++;
}

return even;
}

public static void main(String [] args){

int [] arrays = new int [] {0,1,2,3,4,5,6,7,8,9,10,11};

int [] element = evenPosition(arrays);
 
System.out.print(Arrays.toString(element));
}
}

