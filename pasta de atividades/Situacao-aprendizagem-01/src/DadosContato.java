
public class DadosContato {

	private String email;
	private String telefone;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email.isEmpty()) {
			System.out.println("EMAIL É OBRIGATÓRIO");
			System.exit(0);
		}else {
			this.email = email;
		}
	}
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		
		if(telefone.isEmpty()) {
			
			System.out.println("TELEFONE É OBRIGATÓERIO");
			System.exit(0);
			
		}else{
			
			int tamanho = telefone.length();
			
			if( tamanho == 15) {
				
				System.out.println("APENAS QUATORZE CARACTERES");
				System.exit(0);
			}else {		
				this.telefone = telefone;
			}
		}
	}

}

