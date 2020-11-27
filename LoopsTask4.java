import java.util.Scanner;

public class LoopsTask4 {
	
	public static void main(String[] args){
		
	
		String arrOfName [];
		arrOfName = new String [10];
		
	for (int x=0;x<10; x++){
		System.out.println("Enter name number "+x);
		Scanner names = new Scanner (System.in);
		
		arrOfName[x]=names.next();
		//names.close();
	}//end Scan loop
	
	for(int y=0; y<10;y++){
		
		System.out.println(arrOfName[y]);
	}//end output loop
	
	
	}//end main

}
