package week_2_Cpsc_225;


import java.util.Scanner;
import week_2_Cpsc_225.Rectangle;
import java.lang.Math;
import java.util.Random;

public class Week_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		Rectangle rec = new Rectangle(5,6);
		
		double area = rec.getArea();
		double peri = rec.getPerimeter();
		
		System.out.println(area + " " + peri);
		
		Rectangle rec2 = new Rectangle(2,4);
		System.out.print(rec2.getArea()+" "+rec2.getPerimeter());
		*/
		
		/*
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double a = Math.sqrt(Math.pow(y2-y3, 2)+ Math.pow(x3-x2,2));
		double b = Math.sqrt(Math.pow(y3-y1, 2)+ Math.pow(x3-x1,2));
		double c = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1,2));
		
		double angleA = Math.acos((a*a-b*b-c*c)/(-2*b*c));
		double angleB = Math.acos((b*b-a*a-c*c)/(-2*a*c));
		double angleC = Math.acos((c*c-a*a-b*b)/(-2*a*b));
		
		System.out.print(angleA + " " + angleB + " " + angleC);
		
		*/
		
		/*
		Rectangle rec = new Rectangle();
		Rectangle rec2 = new Rectangle();
		Rectangle rec3 = new Rectangle();
		
		System.out.print(Rectangle.getNumberOfObject());
		*/
		
		/*
		Random rand = new Random();
		
		int num = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		
		int ans = input.nextInt();
		
		while(ans != (num+num2)) {
			System.out.print("huh?");
			ans = input.nextInt();
		}
		System.out.print("good job");
		*/
		
		
		/*
		int randNum = (int)(Math.random()*101);
		System.out.print(randNum);
		
		int num = input.nextInt();
		
		while(randNum != num) {
			
			if (randNum != num) {
				System.out.print("high");
			}else {
				System.out.print("low");
			}
			System.out.print("enter 0 - 100");
			num = input.nextInt();
		}
		
		
		System.out.print("gj");
		*/
		
		/*
		int num = input.nextInt();
		
		int sum = num;
		
		for (; num != 0; sum += num) {
			num = input.nextInt();
		}
		
		System.out.print(sum);
		*/
		
		/*
		int num = input.nextInt();
		int num2 = input.nextInt();
		
		int minNum = Math.min(num, num2);
		int counter = minNum;
		
		while(true){
			if((num % counter == 0) && (num2 % counter == 0)) {
				break;
			}else {
				counter--;
			}
		}
		System.out.print("GCD is" + counter);
		
		
		*/
		
		/*
		System.out.println(prime(2));
		System.out.println(prime(3));
		System.out.println(prime(4));
		System.out.println(prime(5));
		System.out.println(prime(6));
		System.out.println(prime(7));
		System.out.println(prime(8));
		*/
		
		/*
		System.out.print("  ");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%2d ", i);
		}
		System.out.println();
		
		for (int i = 1; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " ");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%2d ", i * j);
			}
			System.out.println();
		}
		
		
		*/
		
		
		
		/*
		String word = input.next();
		boolean palin = true;
		
		for (int i = 0; i < word.length()/2; i++) {
			if (word.charAt(i) != word.charAt(word.length()-1-i)) {
				palin = false;
				break;
			}
		}
		
		if (palin == false) {
			System.out.print("not palin");
		}else {
			System.out.print("is palin");
		}
		*/
		
		
		/*
		if("Burnaby".compareToIgnoreCase("Burnaby") < 0) {
			System.out.print(false);
		}else {
			System.out.print(true);
		}
		*/
		
		/*
		double[] arr = new double[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		*/
		
		/*
		double[] arr = new double[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
		
		
		for(int i = 0; i < arr.length;i++) {
			double temp = 0.0;
			
			temp = arr[i];
			arr[i] = arr[10-1-i];
			arr[10-1-i] = temp;
			
			System.out.print(arr[i]+ " ");
			
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
		
		
		
		*/
		
		
	}
	
	
	
	/*
	public static boolean prime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	*/
	
	

}
