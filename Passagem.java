import java.util.*;

class ComparaPorNome implements Comparator<Passagem>{

	@Override
	public int compare(Passagem o1, Passagem o2) {
		return  o1.getPassageiro().getNome().compareTo(o2.getPassageiro().getNome());
	}
	
}

public class Passagem {
    private Voo vooIda;
    private Voo vooVolta;
    private String numero;
    private Passageiro passageiro;
    private String assento;
    
    public Passagem(Voo vooIda, String numero, Voo vooVolta, Passageiro passageiro, String assento) {
    	setVooIda(vooIda);
    	setVooVolta(vooVolta);
        setNumero(numero);
        setPassageiro(passageiro);
        setAssento(assento);
    }

        public Passagem(Voo vooIda, String numero, Passageiro passageiro, String assento) {
        setVooIda(vooIda);
        setNumero(numero);
        setPassageiro(passageiro);
        setAssento(assento);
    }

    public Voo getVooIda() {
        return vooIda;
    }
    public void setVooIda(Voo vooIda) {
    	if(verificarCapacidade(vooIda)) {
            this.vooIda = vooIda;
        	}
        	else {
        		System.err.println("Voo de ida cheio :(");
        	}
    }
    public Voo getVooVolta() {
        return vooVolta;
    }
    public void setVooVolta(Voo vooVolta) {
    	if (verificarCapacidade(vooVolta)) {
            this.vooVolta = vooVolta;
        } else {
            System.err.println("Voo de volta cheio :(");
        }
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
    
    
    public boolean verificarCapacidade(Voo voo) {
    	if(voo.getCapacidade() > 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

	@Override
	public String toString() {
		return "Número do Voo: " + getVooIda().getNumVoo() + "\nNúmero da passagem: "
				+ getNumero() + "\nNome do Passageiro: " + getPassageiro().getNome() + "\nNúmero do assento: " + getAssento() + "//";
	}
    
}
