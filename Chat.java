package Faune;

public class Chat extends Mammifere{
    private String color;
    private Chat partenaire;


    public Chat(String n, double P, String g, int nbP, String C, Chat part) {
        super(n, P, g, nbP);
        color = C;
        partenaire = part;
    }

    String cri () {
        return "Miaou";
    }

    public String getColor() {
        return color;
    }
    public String setColor(String newColor) {
        color = newColor;
        return color;
    }

    public Chat getPartenaire() {
        return partenaire;
    }
    public Chat setPartenaire(Chat newPartenaire) {
        partenaire = newPartenaire;
        return partenaire;
    }

    public String quiSuisJe() {
        String who = super.quiSuisJe() + "\nCouleur : " + getColor();
        return who;
    }

}
