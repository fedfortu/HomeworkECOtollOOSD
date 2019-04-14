package it.univaq.oosdHomework.Autostrada;


/**
 *
 * @author Federico Fortunato ~~~~~~~~ Matricola :249398
 */
public class Casello {
    private String nome;
    private float km;

    public Casello(String nome, float km) {
        this.nome = nome;
        this.km = km;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    public float calcolatragitto(Casello c){
        float tragitto;
        tragitto= this.km - c.getKm();
        return tragitto;
    }
   
}
