/**
 * Lesson 6. HomeWork
 *
 * @author SotnikovVS
 * @version 21.11.2021
 *
 */
public class SixthHomeWork {
    public static void main(String[] args) {
        System.out.println("Creation Dog without variable of type:");
        System.out.println(new Dog("Bob") + "\n");
        System.out.println("Creation Animal without variable of type:");
        System.out.println(new Animal("Hedgehog"));
        System.out.println("Creation Dog Jack:");
        Dog Jack = new Dog("Jack");
        System.out.println(Jack + "\n");
        System.out.println("Creation Cat Kitty:");
        Cat Kitty = new Cat("Kitty");
        System.out.println(Kitty + "\n");
        System.out.println("Creation Dog using constructor without parameters:");
        Dog someDog = new Dog();
        System.out.println(someDog);
        System.out.println("Creation Cat using constructor without parameters:");
        Cat someCat = new Cat();
        System.out.println(someCat);

        System.out.println(Jack.getName() + "'s swimming:");
        Jack.swim();
        System.out.println(Jack.getName() + "'s running:");
        Jack.run();
        System.out.println(Jack.getName() + " +150 meters running:");
        Jack.run(150);
        System.out.println(Jack.getName() + " +350 meters running:");
        Jack.run(350);
        System.out.println(Jack.getName() + " +10 meters running:");
        Jack.run(10);
        System.out.println("\n" + Kitty.getName() + "'s swimming:");
        Kitty.swim();
        System.out.println(Kitty.getName() + " +10 meters swimming:");
        Kitty.swim(10);
        System.out.println("\n" + Kitty.getName() + "'s running:");
        Kitty.run();
        System.out.println(Kitty.getName() + " +150 meters running:");
        Kitty.run(150);
        System.out.println(Kitty.getName() + " +100 meters running:");
        Kitty.run(100);
        System.out.println(Kitty.getName() + " +50 meters running:");
        Kitty.run(50);

        System.out.println("\nAnimals amount " + Animal.countA);
        System.out.println("Dogs amount " + Dog.countD);
        System.out.println("Cats amount " + Cat.countC);
    }
}
