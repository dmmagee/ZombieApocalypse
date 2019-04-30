public class SingingZombie extends Zombie {

    SingingZombie(String name, int health, String speed) {
        super(name, health, speed);
    }

    public void makeSound() {
        System.out.println(" I love singing, \"Tip toe, through the tulips!\". Says:  " + name);
    }
}
