import Faune.*;
public class Tp3 {
    public static void main(String[]args) {
        Chat bengal = new Chat("Bengal ", 6.1, "F", 4, "Tigré", null);
        Chat mainCoon = new Chat("MainCoon ", 3.2, "M", 4, "Gris", bengal);
        /*Dauphin blueDolphin = new Dauphin("Dauphin Bleu ", 160, "M", 0, 95);*/
        Dauphin orque = new Dauphin("Orque ", 3608, "F", 0, 14);
        /*Mammifere mammoth = new Mammifere("Mammoth ", 0, "M", 0);
        Mammifere fouine = new Mammifere("", 1.7, "", 4);*/
        /*System.out.println("Nom : " + mainCoon.getNom() + "\nPoids : " + mainCoon.getPoids() + "\nGenre : " + mainCoon.getGenre() + "\nNombres de pattes : " + mainCoon.getNbPattes() + "\nCouleur : " + mainCoon.getColor());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Nom : " + bengal.getNom() + "\nPoids : " + bengal.getPoids() + "\nGenre : " + bengal.getGenre() + "\nNombres de pattes : " + bengal.getNbPattes() + "\nCouleur : " + bengal.getColor());*/
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(bengal);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(mainCoon+ "\nPartenaire : " + mainCoon.getPartenaire());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(Animal.getNumOfInstances());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        Animal.ListeAnimaux();

    }
}
