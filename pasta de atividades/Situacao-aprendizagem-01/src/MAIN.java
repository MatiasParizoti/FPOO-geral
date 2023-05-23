
import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		DadosPessoais objdadosPessoais = new DadosPessoais();
		DadosContato objdadosContato = new DadosContato();
		DadosEndereco objdadosEndereco = new DadosEndereco();
		
		System.out.println("###---- BEM VINDO----### ");
		System.out.println("NOME: ");
		objdadosPessoais.setNome(scanner.next());
		
		System.out.println("SOBRENOME: ");
		objdadosPessoais.setSobreNome(scanner.next());
		
		
		System.out.println("DATA DE NASCIMENTO:É NECESSÁRIO USAR ##/##/#### ");
		objdadosPessoais.setDataNascimento(scanner.next());
		
		
		System.out.println("GENERO: (masculino, feminino ou outros) ");
		objdadosPessoais.setGenero(scanner.next());
		
		
		System.out.println("###---- AGORA VAMOS PARA A PARTE 2----### ");
		System.out.println("EMAIL: ");
		objdadosContato.setEmail(scanner.next());
		
		
		System.out.println("TELEFONE:É NECESSÁRIO O USO DE (##)## ");
		objdadosContato.setTelefone(scanner.next());
		
		System.out.println("###---- POR FIM CHEGAMOS NA PARTE 3----### ");
		System.out.println("CEP: ");
		objdadosEndereco.setCep(scanner.next());
		
		System.out.println("LOGRADOURO: ");
		objdadosEndereco.setLogradouro(scanner.next());
		
		System.out.println("NUMERO: ");
		objdadosEndereco.setNumero(scanner.next());
		
		System.out.println("BAIRRO: ");
		objdadosEndereco.setBairro(scanner.next());
		
		System.out.println("CIDADE: ");
		objdadosEndereco.setCidade(scanner.next());
		
		System.out.println("ESTADO: ");
		objdadosEndereco.setEstado(scanner.next());
		
		System.out.println("OBRIGADO PELAS INFORMAÇÕES ;)");
		
		

	}

}
