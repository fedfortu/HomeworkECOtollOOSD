package it.univaq.oosdHomework.Autostrada;


import java.util.List;


/**
 *
 * @author Federico Fortunato ~~~~~~~~ Matricola :249398
 */
public class Autostrada {
    private String nome;
    private String tipo;
    private List<Casello> Caselli;
    private float tariffa_tipo;

    public Autostrada(String nome, String tipo, List<Casello> Caselli, float tariffa_tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.Caselli = Caselli;
        this.tariffa_tipo = tariffa_tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public List<Casello> getCaselli() {
        return Caselli;
    }

    public void setCaselli(List<Casello> Caselli) {
        this.Caselli = Caselli;
    }

    public float getTariffa_tipo() {
        return tariffa_tipo;
    }

    public void setTariffa_tipo(float tariffa_tipo) {
        this.tariffa_tipo = tariffa_tipo;
    }
    
    
}
