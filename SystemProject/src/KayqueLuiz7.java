package classe.system;

public class classesystem {

	public static void main(String[] args) {
		
		System.out.println("#### VERIFICA S.O ####");
		
		System.out.println("NOME DO SISTEMA OPERACIONAL: " + System.getProperty("os.name"));
		
		System.out.println("ARQUITETURA DO SISTEMA OPERACIONAL: " + System.getProperty("os.arch"));
		
		System.out.println("VERSÃO DO SISTEMA OPERACIONAL: " + System.getProperty("os.version"));
		
		System.out.println("SEPARADOR DE ARQUIVOSDO S.O: " + System.getProperty("path.separator"));
		
		System.out.println("SEPARADOR DE LINHAS: " + System.getProperty("line.separator"));
		
		System.out.println("HOME DO USUÁRIO: " + System.getProperty("user.home"));
		
		System.out.println("HOME DO USUÁRIO: " + System.getProperty("user.dir"));
	
	}

}