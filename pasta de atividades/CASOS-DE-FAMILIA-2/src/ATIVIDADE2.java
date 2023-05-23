import java.util.Scanner;

public class ATIVIDADE2 {

	public static void main(String[] args) {
		System.out.println("copiar da atividade anterior e mudar a formula para a atividade expecifica: ");
		
		Scanner scanner= new Scanner(System.in);
		
        double C, F;
        
        System.out.println("LER UMA TEMPERATURA EM GRAUS FAHRENHEIT, CONVERTER PARA CELSIUS"
        		+ " E APRESENTAR O RESULTADO.");
        
        System.out.println("FAHRENHEIT:");
        F = scanner.nextDouble();
        
        C = (F - 32) / 1.8;
        
        System.out.println("RESULTADO : " + C);


	}

}
