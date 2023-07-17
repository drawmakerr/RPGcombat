package rpgcombat;

public class Character {

    int health;
    int level;
    boolean alive;
    int damage;
    public Character(int health, int level, boolean alive, int damage) {
        this.health = health;
        this.level = level;
        this.alive = alive;
        this.damage = damage;
    }

    public int attack() {
        return this.damage;
    }

    public int receiveDamage(int damage) {
        return this.health -= damage;
    }
}
