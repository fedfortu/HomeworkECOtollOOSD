package it.univaq.oosdHomework.Autostrada;



import it.univaq.oosdHomework.interfaccia.CalcoloPedaggio;
import it.univaq.oosdHomework.Veicolo.Veicolo;
/**
 *
 * @author Federico Fortunato ~~~~~~~~ Matricola :249398
 */
public class Pedaggio implements CalcoloPedaggio{
    private float costo;

    public Pedaggio(Casello c1, Casello c2, Autostrada a, Veicolo v) {
        costo = calcolaPedaggio(v, a, c1, c2);
    }
    
    
    @Override
    public final float calcolaPedaggio(Veicolo v, Autostrada a, Casello c1, Casello c2){
        float tariffaTot;
        float kmPercorsi;
        tariffaTot = v.getTariffa() + a.getTariffa_tipo();
        kmPercorsi = Math.abs(c1.calcolatragitto(c2));
        costo = (tariffaTot * kmPercorsi);
        costo = (float) (costo + (0.22*costo));
        costo = (float) Math.round(costo * 10)/10;
        
        System.out.println("il costo del tragitto tra " + c1.getNome() + " e " + c2.getNome() + " è di " + costo + " euro");
        
        return costo;
     }

     
    
}
