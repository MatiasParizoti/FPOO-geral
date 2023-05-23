import java.util.Scanner;

public class ATIVIDADE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner= new Scanner(System.in);
		
        double L, D, T, V;
        
        System.out.println("O PROGRAMA DEVE APRESENTAR OS VALORES DE VELOCIDADE MÉDIA, TEMPO GASTO NA VIAGEM, "
        		+ "DISTÂNCIA PERCORRIDA E QUANTIDADE DE LITROS GASTOS NA VIAGEM.");
        
        
        System.out.println("DIGITE O TEMPO DA VIAGEM:");
        T = scanner.nextDouble();
        
        System.out.println(" DIGITE A VELOCIDADE DA VIAGEM:");
        V = scanner.nextDouble();
        
       D = T * V;
        
        
        L = D / 12;
        
        System.out.println("DISTÂNCIA PERCORRIDA = " + D);
        System.out.println("LITROS USADOS = " + L);
       	}

}
