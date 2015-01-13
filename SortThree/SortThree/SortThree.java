/*Sort Three Numbers
  By Steven Quaethem
  Dec. 15, 2014 */

package SortThree;
import javax.swing.*;

public class SortThree {

		public static void main(String[] args) {
			String Number1$ = JOptionPane.showInputDialog("Enter the first integer: ");
			String Number2$ = JOptionPane.showInputDialog("Enter the second integer: ");
			String Number3$ = JOptionPane.showInputDialog("Enter the third integer: ");
			
			//Convert Integers
			int Number1 = Integer.parseInt(Number1$);
			int Number2 = Integer.parseInt(Number2$);
			int Number3 = Integer.parseInt(Number3$);
			int first_number = 0;
			int second_number = 0;
			int third_number = 0;
			
			if (Number1 < Number2 && Number1 < Number3){
				first_number = Number1;
				if(Number2 < Number3){
					second_number = Number2;
					third_number = Number3;
				}
				else {
					second_number = Number3;
					third_number = Number2;
				}
			}
			if(Number2 < Number1 && Number2 < Number3){
				first_number = Number2;
				if(Number1 < Number3){
					second_number = Number1;
					third_number = Number3;
				}
			
			else {
				second_number = Number3;
				third_number = Number1;
			}
			}
		if (Number3 < Number1 && Number3 < Number2){
			first_number = Number3;
			if (Number1 < Number2){
				second_number = Number1;
				third_number = Number2;
				}
				else {
					second_number = Number2;
					third_number = Number1;
					}
			
			}
		String first$ = Integer.toString(first_number);
		String second$ = Integer.toString(second_number);
		String third$ = Integer.toString(third_number);
		
		String output = ("Your sorted number are: " + first$ + " " + second$ + " " + third$);
		JOptionPane.showMessageDialog(null, output);
		
	}

}
