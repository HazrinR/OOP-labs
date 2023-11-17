package week7;
abstract class Animal {
    private String name;
    private int age;

    public abstract void makeNoise();

    public void animalDescription() {
        System.out.println("i am the ".concat(name).concat(" and I am ").concat(String.valueOf(age).concat(" years old.")));
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }}
interface Ability {
    int age=1;
    public void play();
}
class Dog extends Animal implements Ability {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof");
    }
    @Override
    public void play(){
        System.out.println("i play with a ball");}
}
class Lion extends Animal implements Ability
{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise()
    {
        System.out.println("Grrrrr");
    }

    @Override
    public void play() {
        System.out.println("I play with people in a way I eat them.");}}

    class Lab7 {
        public static void main(String[] args) {
            // Creating instances of Cat, Dog, and Lion
            Cat cat = new Cat("Whiskers", 3);
            Dog dog = new Dog("Buddy", 2);
            Lion lion = new Lion("Simba", 5);
            // Setting properties for animals
            cat.setName("Whiskers");
            cat.setAge(3);

            dog.setName("Buddy");
            dog.setAge(2);

            lion.setName("Simba");
            lion.setAge(5);

            // Using methods from the Animal class
            cat.animalDescription();
            cat.makeNoise();

            dog.animalDescription();
            dog.makeNoise();
            dog.play();

            lion.animalDescription();
            lion.makeNoise();
            lion.play();

            // Using the Ability interface
            System.out.println("Ability interface age: " + Ability.age);
        }
    }

