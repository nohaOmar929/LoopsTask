import javax.swing.JOptionPane;

public class LoopsTask2 {


	
	public static void main(String[] args){
	

	
	String input1 = JOptionPane.showInputDialog("Enter your Grade ");
	
	
	if (input1.contains("A")){
		JOptionPane.showMessageDialog(null, "Your Grade Starts from 85 till 100");}
		
		else if (input1.contains("B")) {
			JOptionPane.showMessageDialog(null, "Your Grade starts from 75 till 85 ");
			
		}
		else	if (input1.contains("C")) {
			JOptionPane.showMessageDialog(null, "Your Grade starts from 50 till 65 ");
			
			
		}
		else if (input1.contains("D")) {
			JOptionPane.showMessageDialog(null, "Your Grade Starts from 0 till 50 ");
			
			
		}
		
		else JOptionPane.showMessageDialog(null, "Please Enter a Valid Result");

		
	}//End main
}//end of class