package negozioProdotti;

public class Televisori extends ProdottoTech {
    
     private int dimensioni;
     private boolean smart;

    //costruttore figlio
    public Televisori(int codice, String nome, String marca, double prezzo, double iva, int dimensioni, boolean smart){
        super(codice, nome, marca, prezzo, iva);
        this.setDimensioni(dimensioni);
        this.setSmart(smart);
    }
    
     // SETTER E GETTER ------------>
     
    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }
    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    public int getDimensioni() {
        return dimensioni;
    }
    public boolean isSmart() {
        return smart;
    }

     
}
