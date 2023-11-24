import java.util.InputMismatchException;

public class Endereco {
	

	
	private String rua; 
	private int numero; 
	private String bairro; 
	private String cidade; 
	private String cep;
	
	public Endereco(String rua, int numero, String bairro, String cidade, String cep) {
		super();
		setRua(rua);
		setNumero(numero);
		setBairro(bairro);
		setCidade(cidade);
		setCep(cep);
	}
	
	public Endereco(String cidade) {
		setCidade(cidade);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
