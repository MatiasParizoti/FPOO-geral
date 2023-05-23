import java.util.Scanner;

public class ATIVIDADE1 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
	
        double C, F;
        
        System.out.println("LER UMA TEMPERATURA EM GRAUS CELSIUS, CONVERTER PARA FAHRENHEIT"
        		+ " E APRESENTAR O RESULTADO.");
        
        System.out.println("CELSIUS:");
        C = scanner.nextDouble();
        
        F = (C * 1.8 + 32);
        
        System.out.println("RESULTADO F: " + F);
        
        
        
        
       
	}
	

}
