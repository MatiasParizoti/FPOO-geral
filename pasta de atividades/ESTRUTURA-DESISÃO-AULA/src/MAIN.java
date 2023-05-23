
public class MAIN {

	public static void main(String[] args) {
		
		OperadoresRelacionais objRelacionais = new OperadoresRelacionais();
		TesteDecisao objTeste = new TesteDecisao();
		DecisaoComposta objComposto = new DecisaoComposta();
		Textos objTextos = new Textos();	
		EstruturaDecisaoTexto objDecisaoTexto = new EstruturaDecisaoTexto();
		
		//objRelacionais.TestesLogicos();
		
		//objTeste.testeMenor(10, 100);
	
		//objTeste.testeMenorIgual(20, 200);
		
		//objTeste.testeMaior(106, 69);
		
		//objTeste.testeMaiorIgual(66, 66);
		
		//objTeste.testeIgual(69, 69);
		
		//objTeste.testeDiferente(70, 30);
		
		//objComposto.DecisaoComposto(100, 30);
		
		//objTextos.testesLogicos();
		
		objDecisaoTexto.testeVazio("SESI/SENAI - DESENVOLVIMENTO DE SISTEMAS!");
		objDecisaoTexto.testeIgual("SESI","SENAI");
		objDecisaoTexto.testeIgual("SESI","SESI");
		objDecisaoTexto.contador("MATHEUS111");
		
	}

}
