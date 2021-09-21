package main;
import java.util.Stack;
import java.util.Scanner;

public class Application {

	public static void main(String []args) {
	Stack <String>stack= new <String> Stack();
	Scanner scan=new Scanner(System.in);
	String ans="";
	String test="";
	String help="";
	
	System.out.println("Enter a word to see if it's a palindrome");
	ans=scan.nextLine();
	
	for (int i=0; i<ans.length(); i++) {
		stack.push(ans.substring(i,i+1));
	}
	
	for (int i=0; i<ans.length(); i++) {
		help=stack.pop();
		test= test.concat(help);
	}
	
	if (test.equals(ans)) {
		System.out.println(ans + " is a palindrome");
	}
	else
	{
		System.out.println(ans + " is NOT a palindrome");
	}
	
	}
}
