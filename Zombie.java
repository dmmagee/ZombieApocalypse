import java.util.ArrayList;

public class Zombie extends Monster {

    String name;
    int health;
    String speed;

    Zombie(String name, int health, int numOfMonsters, boolean dead) {
        super(name, health, numOfMonsters, dead);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void makeSound() {
        System.out.println("Generic zombie test " + name + "!");
    }

    public static void main(String[] args) {

        ArrayList<Zombie> zombies = new ArrayList<>();

        Rapzombie rapZombie = new Rapzombie("Rappin Chad", 100, "Fast");
        ShoutingZombie shoutingZombie = new ShoutingZombie("Shouting Bob", 100, "Fast");
        SingingZombie singingZombie = new SingingZombie("Singing Steve", 100, "Fast");
        GroaningZombie groaningZombie = new GroaningZombie("Groaning Bill", 100, "Slow");
        WhisperingZombie whisperingZombie = new WhisperingZombie("Whispering George", 100, "Medium");

        zombies.add(rapZombie);
        zombies.add(shoutingZombie);
        zombies.add(singingZombie);
        zombies.add(groaningZombie);
        zombies.add(whisperingZombie);

        for (Zombie zombie : zombies) {
            zombie.makeSound();
        }
    }
}
