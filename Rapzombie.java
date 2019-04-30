public class Rapzombie extends Zombie {

    Rapzombie(String name, int health, String speed) {
        super(name, health, speed);
    }

    public void makeSound() {
        System.out.println("Forfeit the game, before somebody else takes you out of the frame,");
        System.out.println("Put your name to shame, cover up your face, you can't run the race,");
        System.out.println("The pace is too fast, you just won't last! Says: " + name);
    }
}
