package Oppgaver;
import static javax.swing.JOptionPane.*;

public class O1 {

		public static void main(String[]args) {
			String input_bruttolønn = showInputDialog("Skriv inn din bruttolønn");
			int bruttolønn = Integer.parseInt(input_bruttolønn);
			
			double sats_trinnskatt0 = 0.0;
			double sats_trinnskatt1 = 0.17;
			double sats_trinnskatt2 = 0.4;
			double sats_trinnskatt3 = 0.134;
			double sats_trinnskatt4 = 0.164;
			double sats_trinnskatt5 = 0.174;

			if(bruttolønn<= 190349) {
				double trinnskat = bruttolønn*sats_trinnskatt0;
				System.out.println("Din trinnskat er "+trinnskat+" kroner"); 
			}
			else if(bruttolønn > 190349 && bruttolønn<= 267899) {
				double trinnskat = bruttolønn*sats_trinnskatt1;
				System.out.println("Din trinnskat er "+trinnskat+" kroner");
			}
			else if(bruttolønn > 267899 && bruttolønn<= 643799) {
				double trinnskat = bruttolønn*sats_trinnskatt2;
				System.out.println("Din trinnskat er "+trinnskat+" kroner");
			}
			else if(bruttolønn > 643799 && bruttolønn<= 969199) {
				double trinnskat = bruttolønn*sats_trinnskatt3;
				System.out.println("Din trinnskat er "+trinnskat+" kroner");
			}
			else if(bruttolønn > 969199 && bruttolønn<= 1999999) {
				double trinnskat = bruttolønn*sats_trinnskatt4;
				System.out.println("Din trinnskat er "+trinnskat+" kroner");
			}
			else if(bruttolønn<= 2000000) {
				double trinnskat = bruttolønn*sats_trinnskatt5;
				System.out.println("Din trinnskat er "+trinnskat+" kroner");
			}
		}
}
