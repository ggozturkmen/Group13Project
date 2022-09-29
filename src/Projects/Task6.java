package Projects;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please provide 2 different numbers");
	      
	      Scanner scanner=new Scanner(System.in);
	      int num1=scanner.nextInt();
	      int num2=scanner.nextInt();
	      while(num1==num2) {
	    	  System.out.println("Please provide a different second number ");
	    	  num2=scanner.nextInt();
	      }
	      System.out.println("before swapping:\nnum1= "+ num2 + "\n");
	      num1=num1+num2;
	      num2=num1+num2;
	      num1=num1+num2;
	      System.out.println("After swapping:\nnum1= " + num1 + "\nnum2 = " + num2);
		}

	


	



	}


