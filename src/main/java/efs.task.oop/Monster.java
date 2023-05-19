package efs.task.oop;

public abstract class Monster implements Fighter {
    private int health;
    private int damage;
    
    public Monster(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(getDamage());
    }

    @Override
    public void takeHit(int damage) {
        setHealth(getHealth() - damage);
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
