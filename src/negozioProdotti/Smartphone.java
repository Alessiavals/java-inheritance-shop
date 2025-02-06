package negozioProdotti;

public class Smartphone extends ProdottiShop {

    private int codiceIMEI;
    private int memoria;

    // SETTER E GETTER ------------------>

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
