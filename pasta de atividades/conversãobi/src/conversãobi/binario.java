package convers�obi;

import java.util.Scanner;

public class binario {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		int decimal;
		String binario;
		
		System.out.println("DIGITE NUMERO DECIMAL:");
		decimal = scanner.nextInt();
		
		binario = Integer.toBinaryString(decimal);
		
		System.out.println("VALOR EM DECIMAL:" + decimal);
		System.out.println("VALOR DECIMAL CONVERTIDO EM BINARIO:" + binario);
	}

}
