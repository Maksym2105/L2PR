package app.models;

public class Dog extends Animal{

    public static final int MAX_RUN_DISTANCE = 500;
    public static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        AnimalCounter.incrementDogs();
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
        if(distance <= MAX_SWIM_DISTANCE){
            System.out.println(name + " проплив " + distance + " м. ");
        }else{
            System.out.println(name + " не зміг проплисти " + distance + " м. ");
        }
    }

}