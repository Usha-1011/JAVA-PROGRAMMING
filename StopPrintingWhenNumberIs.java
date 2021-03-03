//print the numbers and stop printing if the input is 11

import java.util.*; //to import Scanner class
class StopPrintingWhenNumberIs{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		//exit the loop if the condition is false
		//if the number is not equal to 11 then print the number on the console
		int n = sc.nextInt();
		while(n!=11){
			System.out.println(n) ;
			n = sc.nextInt() ;
		}
	}
}
