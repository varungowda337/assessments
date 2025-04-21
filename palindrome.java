import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int digit;
		System.out.println("Enter the number");
		int number=scan.nextInt();
		int num=number;
		int rev=0;
		for(int i=1;i<=number;i++) {
			digit=number%10;
			rev=rev*10+number;
			number=number/10;
		}
		if(num==rev) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}
	}

}