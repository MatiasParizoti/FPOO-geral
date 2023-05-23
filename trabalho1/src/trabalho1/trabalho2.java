
package trabalho1;

import java.util.Scanner;

public class trabalho2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int decimal;
		String binario;
		
		System.out.println("DIGITE NUMERO DECIMAL");
		decimal = scanner.nextInt();
		
		binario = Integer.toBinaryString(decimal);
		
		System.out.println("NUMERO BINARIO: " + binario);
		
		

		

		
		
	}

}
