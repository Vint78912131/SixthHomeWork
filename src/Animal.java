public class Animal {
    static int countA;
    private String name;

    public Animal(String name) {
        countA++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        this.setName("unknown");
        countA++;
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    public void run(int distance) {
        System.out.println(name + " ran " + distance + " meters.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void swim (int distance) {
        System.out.println(name + " swam " + distance + " meters.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                "}\n";
    }
}
