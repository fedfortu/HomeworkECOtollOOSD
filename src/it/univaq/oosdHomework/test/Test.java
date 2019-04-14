package it.univaq.oosdHomework.test;

import java.util.ArrayList;
import java.util.List;

import it.univaq.oosdHomework.Autostrada.Autostrada;
import it.univaq.oosdHomework.Autostrada.Casello;
import it.univaq.oosdHomework.Autostrada.Pedaggio;
import it.univaq.oosdHomework.Veicolo.Veicolo3;
import it.univaq.oosdHomework.Veicolo.VeicoloA;
import it.univaq.oosdHomework.Veicolo.Veicolo;
/**
 *
 * @author Federico Fortunato ~~~~~~~~ Matricola :249398
 */
public class Test {
    
    public static void main(String[] args) {
                /* variabili in input: modello, marca, targa, anno, numero assi, peso(kg), altezza(cm), tariffa, onero, Euro(1-6) */
		Veicolo3 v1 = new Veicolo3("Sinotruk","Howo", "TE235AR", 2009, 3, 20000, 260, 0.2f, Veicolo.Euro.Euro1);
                VeicoloA v2 = new VeicoloA("Note","Nissan", "RO132AB", 2007, 2, 1800, 120, 0.1f, Veicolo.Euro.Euro2);
                
                /* variabili in input: nome e chilometro */
		Casello c1 = new Casello("Mosciano", 40); 
		Casello c2 = new Casello("Roseto degli abruzzi", 49.6f);
		Casello c3 = new Casello("Pineto-Atri", 57.4f);
		List<Casello> Caselli = new ArrayList<>();
		Caselli.add(c1);
		Caselli.add(c2);
		Caselli.add(c3);
         
                /* variabili in input: nome, tipo, lista di caselli, tariffa per il tipo di autostrada */
		Autostrada a = new Autostrada("Autostrada adriatica", "Pianura", Caselli, 0.01f);
                
                /* c1 è il casello d'ingresso, c2 quello d'uscita, a è l'autostrada, v1 il veicolo*/
		Pedaggio p1 = new Pedaggio(c1, c2, a, v1);
                Pedaggio p2 = new Pedaggio(c3, c1, a, v2);
              
    }
    
  
    
}
