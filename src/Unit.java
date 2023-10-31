public class Unit {
    private String name = "";
    private int health = 1;

    public Unit(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public Unit(Unit unit) {
        this.name = unit.name;
        this.health = unit.health;
    }

    public void printData() {
        System.out.println("-----");
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health);
    }
}