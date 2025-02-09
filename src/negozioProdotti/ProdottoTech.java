package negozioProdotti;

public class ProdottoTech {

    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    //costruttore padre
    public ProdottoTech (int codice, String nome, String marca, double prezzo, double iva) {
        this.codice = codice;
        this.setNome(nome);
        this.setMarca(marca);
        this.setPrezzo(prezzo);
        this.setIva(iva);
    }


    // SETTER---------------

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setMarca(String marca) {
        this.marca = marca;
    }



    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }



    public void setIva(double iva) {
        this.iva = iva;
    }

    // GETTER------------

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    // METODI --------

    public double prezzoTotale() {
        return prezzo + (prezzo * iva / 100);
    }
}
