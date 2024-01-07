public class Account {
	private String name;
	private double balance;
	private int age;

	public void setName(String name){
	this.name = name;	
	}
	public String getName(){
		return name;
	}

public class AccountTest {
public static void main(String[]args){

Account account = new Account();
account.setName("Ikechukwu");

String name = account.getName;

System.out.print("name is: "+ account.getName);




}
}
}