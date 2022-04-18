
public class Cidade {

	private int codigo;
	private String descricao;
	private String uf;
	private int qdadeEstudandes;
	
	public Cidade(int codigo, String descricao, String uf) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.uf = uf;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int adicionaNovoEstudante() {
		qdadeEstudandes += 1;
		return qdadeEstudandes;
	}
	
	public String exibeDados() {
		return "\nCódigo da cidade: " + this.codigo + 
				"\nDescrição: " + this.descricao + 
				"\nUF: " + this.uf + 
				"\nQuantidade de estudantes: " + this.qdadeEstudandes + 
				"\n\n";
	}
	
}
