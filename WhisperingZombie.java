public class WhisperingZombie extends Zombie {

    WhisperingZombie(String name, int health, String speed) {
        super(name, health, speed);
    }

    public void makeSound() {
        System.out.println("Sssshhhhh.... No noise here... Nothing to fear?! Whispers: " + name);
    }
}
