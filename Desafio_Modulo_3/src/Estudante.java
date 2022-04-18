import java.util.Scanner;

public class Estudante {

	private int codigo;
	private String nome;
	private String dataNascimento;
	private String email;
	private String senha;
	private Cidade cidade;
	
	public Estudante(int codigo, String nome, String dataNascimento, String email, String senha, Cidade cidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.senha = senha;
		this.cidade = cidade;
		cidade.adicionaNovoEstudante();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public String exibeDados() {
		return "\n\n********** DADOS DO ESTUDANTE **********\n" + 
				"Código: " + this.codigo + 
				"\nNome: " + this.nome + 
				"\nData de nascimento: " + this.dataNascimento +
				"\nE-mail: " + this.email +
				"\nSenha: " + this.senha + 
				cidade.exibeDados();
	}
	
	// MÉTODO PARA MUDAR A SENHA PADRÃO
	Scanner input = new Scanner(System.in);
	
	public void alteraSenha(String senha) {
		System.out.println("VOCÊ PRECISA MUDAR SUA SENHA PADRÃO!!!");
		boolean senhaAlterada = false;
		do {
			System.out.print("Informe sua senha atual: ");
			String primeiraSenha = input.next();
			if(primeiraSenha.equals(getSenha())) {
				System.out.print("Digite a nova senha: ");
				String novaSenha = input.next();
				System.out.print("Confirme a nova senha: ");
				String confirmaNovaSenha = input.next();
				if(novaSenha.equals(confirmaNovaSenha)) {
					setSenha(novaSenha);
					System.out.println("SENHA ALTERADA COM SUCESSO!");
					senhaAlterada = true;
				} else {
					System.out.println("As senhas informadas não são iguais.");
				}
			} else {
				System.out.println("A senha que você informou não é igual a senha criada inicialmente.");
			}
		} while (senhaAlterada == false);
	}
	
}
