package Faune;
import java.util.LinkedList;
import java.util.Iterator;

public abstract class Animal {
    String nom;
    double poids;
    public static int counter;
    public static LinkedList<Animal> animals = new LinkedList<Animal>();


    public Animal(String n, double P) {
        nom = n;
        poids = P;
        animals.add(this);
        counter++;
    }

    abstract String cri();

    public String getNom() {
        return nom;
    }
    public String setNom(String newName) {
        nom = newName;
        return nom;
    }

    public double getPoids() {
        return poids;
    }
    public double setPoids(double newPoids){
        poids = newPoids;
        return poids;
    }

    public String quiSuisJe() {
        String who = "Nom : " + getNom() + "\nPoids : " + getPoids() + "\nCri : " + cri();
        return who;
    }

    public String toString() {
        return quiSuisJe();
    }

    public static String getNumOfInstances() {
        String fCounter = null;
        if (counter <= 1) {
            fCounter = "Nombre d'animal créé : " + String.valueOf(counter);

        } else {
            fCounter = "Nombre d'animaux créés : " + String.valueOf(counter);
        }
        return fCounter;
    }

    public static void ListeAnimaux()  {
        System.out.println("Liste des animaux créés :\n");
        Iterator<Animal> it;
        for(it=animals.iterator(); it.hasNext();) {
            System.out.println(it.next());
            System.out.println("✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧✧");
        }
    }
}


