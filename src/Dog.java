public class Dog extends Animal{
    static int distanceRun;
    static int distanceSwim;
    static int countD;

    public Dog(String name) {
        distanceRun=0;
        distanceSwim=0;
        countD++;
        this.setName(name);
        System.out.println(this.getName() + " is good boy!");
    }

    public Dog() {
        super();
        countD++;
    }

    @Override
    public void run(int distance) {
        if (distance+distanceRun > 500)
            System.out.println("I can't run more than " + (500-distanceRun) +" meters.\nI've already ran " + distanceRun + " meters.");
        else {
            distanceRun+=distance;
            System.out.println(this.getName() + " have ran " + distanceRun + " meters.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance + distanceSwim > 10)
            System.out.println("I can't swim more than " + (10-distanceSwim) + " meters.\nI've already swam " + distanceSwim + " meters.");
        else {
            distanceSwim+=distance;
            System.out.println(this.getName() + "have ran " + distanceSwim + " meters.");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
            "name='" + this.getName() + '\'' +
            '}';
    }
}
