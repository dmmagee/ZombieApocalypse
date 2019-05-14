class Monster {
    //add fields using the most restrictive type possible
    //For all fields think about the following:
    //(What is the access modifier? Public, Private,Protected? Is it static?)
    private String name;
    private int health;
    private int numOfMonsters;
    public boolean dead;

    //add constructor(s)
    Monster(String name, int health, int numOfMonsters, boolean dead) {
        this.name = name;
        this.health = health;
        this.numOfMonsters = numOfMonsters;
        this.dead = dead;
    }

    //add method getName(). It returns the name of the Monster. What is its access modifier? Is it static?
    public String getName() {
        return name;
    }

    //add method setName(). It has a String parameter used to set the Monster's name. What is its access modifier? Is it static?
    public void setName(String name) {
        this.name = name;
    }

    //add method getHealth(). It returns the health of the Monster. What is its access modifier? Is it static?
    public int getHealth() {
        return health;
    }

    //add method setHealth(). It has a integer parameter used to set the Monster's health. What is its access modifier? Is it static?
    public void setHealth(int health) {
        this.health = health;
    }

    //add method getNumOfMonsters(). It returns the total # of monsters created. What is its access modifier? Is it static?
    public int getNumOfMonsters() {
        return numOfMonsters;
    }

    //function attack takes 2 parameters: the monster to attack and how many many health points the attacked monster loses when attacked
    public void attack(Monster monster, int damage) {
        //print the name of the monster being attacked, lower its health, print it's health
        sayName();
        System.out.println(monster.name + " health is " + (health - damage));
        health = health - damage;
        if (monster.health == 0) {
            System.out.println(monster.name + " is DEAD");
        }

    }

    //function isDead has no parameters. It returns true of the monster is dead and false if its alive.
    //It updates how many monsters are currently in the game
    //It prints the monster's name and whether it's alive or dead
    public boolean isDead() {
        if (health > 0) {
            System.out.println(name + "is alive.");
            dead = false;
        } else {
            System.out.println(name + "is dead.");
            numOfMonsters = numOfMonsters--;
            dead = true;
        }
        return dead;
    }

    //do not change function sayName. It is implemented for you
    public void sayName() {
        System.out.println("You can call me Monster " + name + " if you're nice!");
    }

    public static void main(String[] args) {
        //Test your monster object before moving on
        //create a monster1 object and set it's name
        Monster monster1 = new Monster("Steve", 42, 42, false);
        //make it tell you who it is
        monster1.sayName();
        //set the monster's health and check to see if it was set
        monster1.setHealth(42);
        monster1.getHealth();
        //how many monsters have been created?
        System.out.println(monster1.numOfMonsters + " have been created...");
        //create a monster2 object
        Monster monster2 = new Monster("Jerry" ,42,42,false);
        //how many monsters have been created?

        System.out.println(monster2.numOfMonsters + " have been created...");
        //make monster1 attack monster 2
        monster1.attack(monster2, 12);
        //check to see if monster 2 is alive
        monster2.isDead();
        //if it is, attack it again until it's dead
        while (!monster2.isDead()) {
            monster1.attack(monster2, 12);
        }
        //how many monsters are left?
        System.out.println(monster2.numOfMonsters + " are left...");
    }
}