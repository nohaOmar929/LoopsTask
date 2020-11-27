

	import javax.swing.JOptionPane;

public class LoopsTask1 {

		
			public static void main(String[] args){
			
		
			
			String input1 = JOptionPane.showInputDialog("Enter your Result ");
			
			int result = Integer.parseInt(input1);
			
			if (85>= result && result <= 100){
				JOptionPane.showMessageDialog(null, "Your Grade is: A");}
				
				else if (result >=75  && result <= 85) {
					JOptionPane.showMessageDialog(null, "Your Grade is: B");
					
				}
				else	if (result >=50 && result <= 65) {
					JOptionPane.showMessageDialog(null, "Your Grade is: C");
					
					
				}
				else if (result>0 && result <= 50) {
					JOptionPane.showMessageDialog(null, "Your Grade is: D");
					
					
				}
				
				else JOptionPane.showMessageDialog(null, "Please Enter a Valid Grade");
		
				
		
			
			
			
			}//end main
			


}//End Class 
