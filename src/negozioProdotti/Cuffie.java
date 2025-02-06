package negozioProdotti;

public class Cuffie extends ProdottiShop {

    private String colore;
    private boolean wireless;


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
