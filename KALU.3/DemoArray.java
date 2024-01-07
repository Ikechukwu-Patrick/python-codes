import java.util.Arrays;

public class DemoArray {

public static void main(String[]args) {

int [] score = new int [] {1,2,3,4,5};

int hold [] = new int[score.length];

int count;

for(count = 0; count < score.length; count++){

	hold[count] = score[count] * 2;
}

System.out.print(Arrays.toString(hold));

}
}