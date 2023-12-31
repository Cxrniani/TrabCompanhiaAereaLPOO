import java.util.Calendar;
import java.util.InputMismatchException;

public class Voo {
	private String numVoo;
	private Aeroporto origem;
	private Aeroporto destino;
	private Calendar dataHoraOrigem;
	private Calendar dataHoraDestino;
	private int capacidade;

	public Voo(String numVoo, Aeroporto origem, Aeroporto destino, Calendar dataHoraOrigem, Calendar dataHoraDestino,
			int capacidade) {
		setNumVoo(numVoo);
		setOrigem(origem);
		setDestino(destino);
		setDataHoraOrigem(dataHoraOrigem);
		setDataHoraDestino(dataHoraDestino);
		setCapacidade(capacidade);
	}

	public String getNumVoo() {
		return numVoo;
	}

	public void setNumVoo(String numVoo) {
		this.numVoo = numVoo;
	}

	public Aeroporto getOrigem() {
		return origem;
	}

	public void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}

	public Calendar getDataHoraOrigem() {
		return dataHoraOrigem;
	}

	public void setDataHoraOrigem(Calendar dataHoraOrigem) {
		this.dataHoraOrigem = dataHoraOrigem;
	}

	public Calendar getDataHoraDestino() {
		return dataHoraDestino;
	}

	public void setDataHoraDestino(Calendar dataHoraDestino) {
		this.dataHoraDestino = dataHoraDestino;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Voo [getNumVoo()=" + getNumVoo() + ", getOrigem()=" + getOrigem() + ", getDestino()=" + getDestino()
				+ ", getDataHoraOrigem()=" + getDataHoraOrigem().getTime() + ", getDataHoraDestino()="
				+ getDataHoraDestino().getTime() + ", getCapacidade()=" + getCapacidade() + "]";
	}

}
