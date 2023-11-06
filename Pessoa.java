public abstract class Pessoa {

	private String nome; 
	private String cpf; 
	private String rg; 
	private Endereco endereco; 
	private String celular; 
	private String dataNascimento;
	
	public Pessoa(String nome, String cpf, String rg, Endereco endereco, String celular, String dataNascimento) {
		super();
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setEndereco(endereco);
		setCelular(celular);
		setDataNascimento(dataNascimento);

	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
