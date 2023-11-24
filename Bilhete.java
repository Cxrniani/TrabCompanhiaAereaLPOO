import java.util.*;


public class Bilhete<T> {
	
	private T numBilhete;
	private List<Passagem> listPassagem = new ArrayList<>();
	private double preco;
	private CompanhiaAerea CompanhiaAerea;

	
	public Bilhete(T numBilhete, List<Passagem> listPassagem, double preco, CompanhiaAerea companhiaAerea) {
		super();
		this.numBilhete = numBilhete;
		this.listPassagem = listPassagem;
		this.preco = preco;
		CompanhiaAerea = companhiaAerea;
	}
	
	public T getNumBilhete() {
		return numBilhete;
	}

	public void setNumBilhete(T numBilhete) {
		this.numBilhete = numBilhete;
	}

	public List<Passagem> getListPassagem() {
		return listPassagem;
	}

	public void setListPassagem(List<Passagem> listPassagem) {
		this.listPassagem = listPassagem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public CompanhiaAerea getCompanhiaAerea() {
		return CompanhiaAerea;
	}

	public void setCompanhiaAerea(CompanhiaAerea companhiaAerea) {
		CompanhiaAerea = companhiaAerea;
	}
	
	public void imprimirBilhete() {
		Collections.sort(listPassagem, new ComparaPorNome());
		System.out.println("Número do Bilhete: " + getNumBilhete() + 
				"\nPreço: " + getPreco() + "\nCompanhia Responsável: " + getCompanhiaAerea().getNomeCompanhia()
				+ "\n" + listPassagem.toString().replace("[", "").replace("]", "")); // replace para formatar
	}

	
    
}
