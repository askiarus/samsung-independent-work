public class Mage extends Unit {
    private int mana = 0;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    public Mage(Mage mage) {
        super(mage);
        this.mana = mage.mana;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Mana: " + this.mana);
    }
}