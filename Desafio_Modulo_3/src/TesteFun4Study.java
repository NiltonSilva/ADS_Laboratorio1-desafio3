public class TesteFun4Study {

	public static void main(String[] args) {

		// CRIANDO A PRIMEIRA CIDADE
		Cidade cid1 = new Cidade(123, "São Leopoldo", "RS");
		
		// CRIANDO O PRIMEIRO ESTUDANTE DA PRIMEIRA CIDADE
		Estudante est1 = new Estudante(1, "Nílton Silva", "25/05/1987", "nsfgeo@hotmail.com", "s3nh@", cid1);
		est1.alteraSenha(est1.getSenha());
		System.out.println(est1.exibeDados());
		
		// CRIANDO O SEGUNDO ESTUDANTE DA PRIMEIRA CIDADE
		Estudante est2 = new Estudante(2, "Apolo Ferreira", "02/06/1914", "apolo_ferreira@gmail.com", "viralata_caramelo", cid1);
		est2.alteraSenha(est2.getSenha());
		System.out.println(est2.exibeDados());
		
		// CRIANDO A SEGUNDA CIDADE
		Cidade cid2 = new Cidade(456, "Sapucaia do Sul", "RS");
		
		// CRIANDO O PRIMEIRO ALUNO DA SEGUNDA CIDADE
		Estudante est3 = new Estudante(100, "Atena", "05/10/2017", "atenalab@outlook.com", "@atena2017", cid2);
		est3.alteraSenha(est3.getSenha());
		System.out.println(est3.exibeDados());
		
		// CRIANDO O SEGUNDO ALUNO DA SEGUNDA CIDADE
		Estudante est4 = new Estudante(101, "Madruguinha", "13/10/2014", "madruguinha@gmail.com", "naoSeiASenha", cid2);
		est4.alteraSenha(est4.getSenha());
		System.out.println(est4.exibeDados());

	}

}
