public static int  sum(int i1, int i2) {

int result = 0;

for(int  i = i1; i <= i2; i++)

	result += i;

ssreturn result

public static void main(String [] args) {

System.out.println("The sum of 1 to 10 " + sum(1, 10));

System.out.println("The sum of 20 to 37 " + sum(20, 37));

System.out.println("The sum of 35 to 49 " + sum(35, 49));
}

}