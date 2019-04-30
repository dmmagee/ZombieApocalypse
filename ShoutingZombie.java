public class ShoutingZombie extends Zombie {

    ShoutingZombie(String name, int health, String speed) {
        super(name, health, speed);
    }

    public void makeSound() {
        System.out.println("AAAARRGHHH! LOUD NOISES! WHY AM I A ZOMBIE WHO YELLS?! Yells:  " + name);
    }
}
