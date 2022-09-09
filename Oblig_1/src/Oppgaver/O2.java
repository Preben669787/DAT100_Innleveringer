package Oppgaver;
import static javax.swing.JOptionPane.*;
public class O2 {
	public static void main(String[] args) {
		String karTxt = showInputDialog("Din poengsum: ");
		int poengsum = Integer.parseInt(karTxt);

		if(poengsum>=0 && poengsum<=39) {
			System.out.print("Din bokstavkarakter er F");
		}
		else if(poengsum>=40 && poengsum<=49) {
			System.out.print("Din bokstavkarakter er E");
		}
		else if(poengsum>=50 && poengsum<=59) {
			System.out.print("Din bokstavkarakter er D");
		}
		else if(poengsum>=60 && poengsum<=79) {
			System.out.print("Din bokstavkarakter er C");
		}
		else if(poengsum>=80 && poengsum<=89) {
			System.out.print("Din bokstavkarakter er B");
		}
		else if(poengsum>=90 && poengsum<=100) {
			System.out.print("Din bokstavkarakter er A");
		}else {
			System.out.print("Ugyldig poengsum!");
		}
		
	}
}
