
package it.univaq.oosdHomework.interfaccia;


import it.univaq.oosdHomework.Veicolo.Veicolo;
import it.univaq.oosdHomework.Autostrada.Autostrada;
import it.univaq.oosdHomework.Autostrada.Casello;
/**
 *
 * @author Federico Fortunato ~~~~~~~~ Matricola :249398
 */
public interface CalcoloPedaggio {
    public float calcolaPedaggio(Veicolo v, Autostrada a, Casello c1, Casello c2);
}
