//Adding 2 numbers without using + operator

package assignments;

import java.util.Scanner;

public class SumOfTwoNosWithoutUsingPlusOperator {

	public static void main(String[] args) {
		  //To get to 2 numbers as input
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int a=scan.nextInt();
		System.out.println("Enter the 2nd Number");
		int b=scan.nextInt();
				
		while(b!=0) //Using While loop to execute until the condition becomes false
		{
			int carry=a&b;// carry contains common bits of a and b
			a=a^b;//Using XOR operator sum of bits of a and b where at least one of the bits are not set
			b=carry<<1;//Carry is shifted by one so that adding it to a gives the required sum 
		}
			  System.out.println("Sum of 2 numbers =" +a);//Printing the sum of 2 numbers
			}

		}
//Getting 2 inputs using scanner class and using while loop to check the condition. Taking one variable as carry to store 
//the values of a and b. Using XOR operator sum of bits of a and b where at least one of the bits are not set,
//Carry is shifted by one so that adding it to a gives the required sum. Then printing the sum of 2 numbers.

	