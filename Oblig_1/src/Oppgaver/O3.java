package Oppgaver;

import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * Lag et program som leser inn et heltall n > 0,
 * beregner verdien n! (n fakultet)
 *  og skriver verdien til n! ut på skjermen, der n! = 1*2*3* … *(n-1)*n.
 *
 */
public class O3 {
	public static void main(String[] args) {
		String input_tall = showInputDialog("Skriv inn et tall: ");
		int n = Integer.parseInt(input_tall);
		int sum = 1;
		int i = 1;
		
		// FAKULTET i WHILE LOOP
		if(n>0) {
			while(i<=n) {
				sum = sum*i;
				//n = n-1;
				i++;
	
			}
			System.out.println(sum);
		}else {
			System.out.print("Ugyldig input");
		}
	}
}
