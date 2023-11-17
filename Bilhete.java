import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		for (int i = 0; i < listPassagem.size(); i++) {
			System.out.println(listPassagem.get(i));
		}
	}

	
    
}
