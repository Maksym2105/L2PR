package app.models;

public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
        AnimalCounter.incrementAnimals();

    }

    public void run (int distance){
    }

    public void swim(int distance){
    }
}