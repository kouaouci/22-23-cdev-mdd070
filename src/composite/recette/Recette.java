package composite.recette;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recette implements ComposantPizza {

    private Map<ComposantPizza, Double> composantPizza = new HashMap<> ();

    public void add(double quantite, ComposantPizza composantPizza) {
        this.composantPizza.put ( composantPizza, quantite );
    }

    @Override
    public double getPrix() {
        double prixTotal = 0;
        for (Map.Entry<ComposantPizza, Double> entry : composantPizza.entrySet ()) {
            ComposantPizza composantPizza = entry.getKey ();
            double quantite = entry.getValue ();
            prixTotal += composantPizza.getPrix () * quantite;
        }
        return prixTotal;

    }
}