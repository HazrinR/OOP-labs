package week5;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;


abstract class Box1{
    private List<Thing> things=new ArrayList<>();
    public abstract void add(Thing thing);
    public void add(Collection<Thing> things){
        for(Thing thing: things){
            add(thing);
        }
    }
    public abstract boolean isInTheBox(Thing thing);
}
class Thing {
    private String name;
    private int weight;
    public Thing(String name, int weight) throws IllegalAccessException {
        if(weight <0){
            throw new IllegalAccessException("weigh cannot be negative");
        }
        this.name=name;
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null || getClass()!=obj.getClass()){
            return false;
        }
        Thing otherThing=(Thing) obj;
        return name.equals(otherThing) && weight== otherThing.weight;
    }
    public int hashCode(){
        return name.hashCode();
    }
    public String toString(){
        return name + " (" + weight + " kg)";
    }
}
class MaxWeightBox extends Box1{
    private int maxWeight;
    private int curretWeight;
    public MaxWeightBox(int maxWeight){
        this.maxWeight= maxWeight;
        this.curretWeight = 0;
    }
    public void add(Thing thing) {
        if (curretWeight + thing.getWeight() <= maxWeight) {
            curretWeight += thing.getWeight();
        } else {
            return;
        }
    }

    public boolean isInTheBox(Thing thing) {
        return thing.getWeight() <= maxWeight && curretWeight >= thing.getWeight();
    }

}
class OneThingBox extends Box1{
    private Thing thing;
    public OneThingBox(){
        this.thing=null;
    }
    @Override
    public void add(Thing thing){
        if(this.thing==null){
            this.thing=thing;
        }
    }
    @Override
    public boolean isInTheBox(Thing thing){
        if(this.thing!= null){
            return this.thing.equals(thing);
        }return false;
    }
}
class BlackHoleBox extends Box1{
    public BlackHoleBox(){

    }
    @Override
    public void add(Thing thing){
        //uvijek mozemo dodavati things
    }
    @Override
    public boolean isInTheBox(Thing thing){
        return false; //uvijek vraca false tj nikad ne mozemo vidjeti sta je unutra
    }
}

public class Main3 {
    public static void main(String[] args) throws IllegalAccessException {
        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));

        System.out.println(
                coffeeBox.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka", 5)));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak", 5)));

        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(box.isInTheBox(new Thing("Pirkka", 5)));

        BlackHoleBox box1 = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo", 5)));
        System.out.println(box.isInTheBox(new Thing("Pirkka", 5)));

    }
}
