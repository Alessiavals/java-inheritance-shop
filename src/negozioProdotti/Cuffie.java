package negozioProdotti;

public class Cuffie extends ProdottoTech {

    private String colore;
    private boolean wireless;

    // costruttore figlio
    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless){
        super(codice, nome, marca, prezzo, iva);
        this.setColore(colore);
        this.setWireless(wireless);
    }

    // SETTER E GETTER ------------->
    
    public void setColore(String colore) {
        this.colore = colore;
    }
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    
    public String getColore() {
        return colore;
    }
    public boolean isWireless() {
        return wireless;
    }
    
    
}
