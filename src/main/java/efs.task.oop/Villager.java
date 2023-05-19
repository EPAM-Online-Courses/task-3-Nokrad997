package efs.task.oop;

public class Villager implements Fighter{
    protected String name;
    protected int age;
    protected int health = 100;
    
    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.print("Greetings traveler... I'm " + this.name + " and I'm " + this.age + " years old");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if(health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int)(100 - age * 0.5) / 10);
    }

    @Override
    public void takeHit(int damage) {
        if(health - damage < 0) {
            health = 0;
        } else {
            health -= damage;
        }
    }
}
