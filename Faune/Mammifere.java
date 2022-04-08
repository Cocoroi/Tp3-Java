package Faune;

public abstract class Mammifere extends Animal{
    private String genre;
    private int nbPattes;

    public Mammifere(String n, double P, String g, int nbP) {
        super(n, P);
        genre = g;
        nbPattes = nbP;
    }

    public String getGenre() {
        return genre;
    }
    public String setGenre(String newGenre) {
        genre = newGenre;
        return genre;
    }

    public double getNbPattes() {
        return nbPattes;
    }
    public double setNbPattes(int newNbPattes){
        nbPattes = newNbPattes;
        return nbPattes;
    }

    public String quiSuisJe() {
        String who = super.quiSuisJe() + "\nGenre : " + getGenre() + "\nNombre de pattes : " + getNbPattes();
        return who;

    }
}
