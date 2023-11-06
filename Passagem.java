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
    
}
