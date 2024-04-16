import javax.swing.JOptionPane;
/* Author - Christian Ramsey Professor Tong 11/02/2022
 * In this assignment, we were instructed to create a program that displays the amount of
 * times a letter appears in a string. We were also instructed to use JOptionPane to input and display
 * our results, which I did somewhat successfully, but could not fully figure out how to display the results
 * correctly. I was able to input the string into the window, but I could not figure out how to display 
 * the dialog in one window, without it having to open a new window every time to display a new message.
 * 
 */
public class lab10 {
	public static void main(String[] args) {
		//takes in user input
		String input = JOptionPane.showInputDialog("Enter a string");
		int i, j, k;
		char[] chr = input.toCharArray();
		int len = chr.length;
		for ( i = 0; i < len; i++) {
			int counter = 0;
			char c = input.charAt(i);
		
		
		for ( j = 0; j < len; j++) {
			if (c == chr[j]){
				counter++;
			}
		}
		if(counter > 0) {
			JOptionPane.showMessageDialog(null, c+ " appears " +counter+ " times ");
			}
		}
	}
}

