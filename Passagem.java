import java.util.*;

class ComparaPorNome implements Comparator<Passagem>{

	@Override
	public int compare(Passagem o1, Passagem o2) {
		return ((Passagem) o1).getPassageiro().getNome().compareTo(((Passagem) o2).getPassageiro().getNome());
	}
	
}

public class Passagem {
    private Voo vooIda;
    private Voo vooVolta;
    private String numero;
    private Passageiro passageiro;
    private String assento;
    
    public Passagem(Voo vooIda, String numero, Voo vooVolta, Passageiro passageiro, String assento) {
    	verificarCapacidade();
        setNumero(numero);
        setPassageiro(passageiro);
        setAssento(assento);
    }

        public Passagem(Voo vooIda, String numero, Passageiro passageiro, String assento) {
        verificarCapacidade();
        setNumero(numero);
        setPassageiro(passageiro);
        setAssento(assento);
    }

    public Voo getVooIda() {
        return vooIda;
    }
    public void setVooIda(Voo vooIda) {
        this.vooIda = vooIda;
    }
    public Voo getVooVolta() {
        return vooVolta;
    }
    public void setVooVolta(Voo vooVolta) {
        this.vooVolta = vooVolta;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }    
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    public String getAssento() {
        return assento;
    }
    public void setAssento(String assento) {
        this.assento = assento;
    }
    
    
    public boolean verificarCapacidade() {
    	if(vooIda.getCapacidade() == 0 || vooVolta.getCapacidade() == 0) {
    		System.out.println("Voo sem disponibilidade :(");
    		return false;
    	}
    	else {
    		setVooIda(vooIda);
    		setVooVolta(vooIda);
    		return true;
    	}
    }
    
}
