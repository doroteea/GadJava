package lab2.ch1;

public class Fighter {
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    private static int counter;
    private String name;
    private int health;
    private int damagePerAttack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }


    public void attack(Fighter f){
        f.health = f.health - damagePerAttack;
    }
}
