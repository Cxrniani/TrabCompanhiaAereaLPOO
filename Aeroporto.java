public class Aeroporto {


	private String codAeroporto;
	private Endereco endereco;
	
	public Aeroporto(String codAeroporto, Endereco endereco) {
		super();
		setCodAeroporto(codAeroporto);
		this.endereco = endereco;
	}
	
	public String getCodAeroporto() {
		return codAeroporto;
	}
	public void setCodAeroporto(String codAeroporto) {
		this.codAeroporto = codAeroporto;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
