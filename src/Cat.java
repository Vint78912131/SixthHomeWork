public class Cat extends Animal{
    static int distanceRun;
    static int countC;

    public Cat(String name) {
        distanceRun=0;
        countC++;
        this.setName(name);
        System.out.println(this.getName() + " walks wherever wants.");
    }

    public Cat() {
        super();
        countC++;
    }

    @Override
    public void run(int distance) {
        if (distance+distanceRun > 200)
            System.out.println("I can't run more than " + (200-distanceRun) + " meters.\nI've already ran " + distanceRun + " meters.");
        else {
            distanceRun+=distance;
            System.out.println(this.getName() + " have ran " + distanceRun + " meters.");
        }
    }

    @Override
    public void swim() {
        System.out.println("Cats not swimming!");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Are you crazy?");
        swim();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.getName() + '\'' +
                '}';
    }
}
