package app.models;

public class AnimalCounter {

    private static int animalCount = 0;
    private static int catCount = 0;
    private static int dogCount = 0;

    public static void incrementAnimals(){
        animalCount++;
    }
    public static void incrementCats(){
        catCount++;
    }
    public static void incrementDogs(){
        dogCount++;
    }

    public static void printCount(){
        System.out.println("Кількість тварин " + animalCount + ".");
        System.out.println("Котів " + catCount + ".");
        System.out.println("Собак " + dogCount + ".");
    }
}