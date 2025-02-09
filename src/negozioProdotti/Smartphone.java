package negozioProdotti;

public class Smartphone extends ProdottoTech {

    private int codiceIMEI;
    private int memoria;

    // costruttore figlio che eredita dal padre 
    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, int codiceIMEI, int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.setCodiceIMEI(codiceIMEI);
        this.setMemoria(memoria);
    }

    // SETTER E GETTER ------------------>


    public void setCodiceIMEI(int codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public int getCodiceIMEI() {
        return codiceIMEI;
    }
    public int getMemoria() {
        return memoria;
    }
    
}
