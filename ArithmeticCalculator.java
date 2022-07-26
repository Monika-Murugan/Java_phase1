import java.util.Scanner;
class Calculator{
	public void add() {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("the answer is= "+(a+b));
	}
	public void sub() {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("the answer is= "+(a-b));
	}
	public void mul() {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("the answer is= "+(a*b));
	}
	public void dev() {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("the answer is= "+(a/b));
	}
}

public class ArithmeticCalculator {
	public static void main(String[] args) {
		int Choice;
		Calculator c=new Calculator();
		System.out.println("choose which operation you have to done!!"+"\n"+"1.Addition"+"\n"+"2.Subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Devision");
		Scanner sc=new Scanner(System.in);
		Choice=sc.nextInt();
		switch(Choice) {
		case 1:
			c.add();
			break;
		case 2:
			c.sub();
			break;
		case 3:
			c.mul();
			break;
		case 4:
			c.dev();
			break;
		}
	}

}
