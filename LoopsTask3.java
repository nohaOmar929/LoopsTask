import java.util.Scanner;

public class LoopsTask3 {
public static void main(String[] args){
	
System.out.println("Enter a Number you want to get multiblication of ");
	Scanner get = new Scanner (System.in);
	 
	int result = get.nextInt();
	int x=0;
	do {
		 int output= result* x;
		 System.out.println(output);
	x++;
	}
	while( x<=12);
	
}//end main
}// end class
