package Faune;

public class Dauphin extends Mammifere{
    private int nbDents;

    public Dauphin(String n, double P, String g, int nbP, int nbD) {
        super(n, P, g, nbP);
        nbDents = nbD;
    }

    String cri () {
        return "Cliquette";
    }

    public int getNbDents() {
        return nbDents;
    }
    public int setNbDents(int newNbDents) {
        nbDents = newNbDents;
        return nbDents;
    }

    public String quiSuisJe() {
        String who = super.quiSuisJe() + "\nNombre de dents : " + getNbDents();
        return who;
    }
}
