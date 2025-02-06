package negozioProdotti;

public class Televisori extends ProdottiShop {
    
     private int dimensioni;
     private boolean smart;

    
    
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
