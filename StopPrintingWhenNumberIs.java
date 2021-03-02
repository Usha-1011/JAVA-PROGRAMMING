//print the numbers and stop printing if the input is 11

class StopPrintingWhenNumberIs{
	public static void main(String[] args) {

		int n = args.length;//length of the args array(input)

		//for loop to check for each input in the args(input through cmd)
		for(int i=0 ; i<n ; i++){

			//typecast args[i](which is a String) to an integer which is then compared with 11(of int type)
			//exit the loop if the condition is true
			//if the number is not equal to 11 then print the number on the console

			if(Integer.parseInt(args[i]) == 11)
				break ;
			else 
				System.out.println(args[i]);

		}
	}
}