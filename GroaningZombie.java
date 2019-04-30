public class GroaningZombie extends Zombie {

    GroaningZombie(String name, int health, String speed) {
        super(name, health, speed);
    }

    public void makeSound() {
        System.out.println("Unnnnnnggghhhhh... grrroooooaaannnn... My robotic zombie interface gives me cramps... Says: " + name);
    }
}
