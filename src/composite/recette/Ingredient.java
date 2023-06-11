package composite.recette;

public class Ingredient implements  ComposantPizza{
    private double prix;
    private String unite;

    public Ingredient(double prix, String unite) {
        this.prix = prix;
        this.unite = unite;
    }


    @Override
    public double getPrix() {
        return prix;
    }
}