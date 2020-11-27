import java.util.Scanner;


public class LoopsTask5 {
	
	public static void main (String[] args){
		
		int numberArr[] = new int[5];
		 int average=0, total=0;
	for(int counter=0;counter<5; counter++){

		System.out.println("Enter index " +counter);
		
		Scanner num = new Scanner(System.in);
		
		 numberArr[counter]=num.nextInt();
		
	}
		
	for(int x=0; x<5; x++){
		total+= numberArr[x];
		
		if(x==4){
			average= total/5;
			System.out.println("total is is: "+ total);
			System.out.println("average is: "+ average);
			
					
		}//endif
		else
			continue;
			
	}
		
	}//end main
}
