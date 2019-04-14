
package it.univaq.oosdHomework.Veicolo;
/**
 *
 * @author Federico Fortunato ~~~~~~~~ Matricola :249398
 */
public class Veicolo {
    
    private String modello;
    private String marca;
    private String targa;
    private int anno; 
    private int assi;
    private int peso;
    private int altezza;
    private float tariffa;
    private Euro euro;
    
    public enum Euro {
        
        Euro1,
        Euro2,
        Euro3,
        Euro4,
        Euro5,
        Euro6;
    }
   

    public Veicolo(String modello, String marca, String targa, int anno, int assi, int peso, int altezza, float tariffa, Euro euro) {
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.anno = anno;
        this.assi = assi;
        this.peso = peso;
        this.altezza = altezza;
        this.tariffa = tariffa;
        this.euro = euro;
       
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }
    
    
    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    
    public int getAssi() {
        return assi;
    }

    public void setAssi(int assi) {
        this.assi = assi;
    }
    
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
    
    public Euro getEuro() {
        return euro;
    }

    public void setEuro(Euro euro) {
        this.euro = euro;
    }

    public float getTariffa() {
        return tariffa;
    }

    public void setTariffa(float tariffa) {
        this.tariffa = tariffa;
    }

        
}
