package app.models;

public class Cat extends Animal{

    public static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
        AnimalCounter.incrementCats();
    }

    @Override
    public void run(int distance) {
        if(distance <= MAX_RUN_DISTANCE){
            System.out.println(name + " пробіг " + distance + " м. ");
        }else{
            System.out.println(name + " не зміг пробігти " + distance + " м. ");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не вміє плавати. ");
    }
}