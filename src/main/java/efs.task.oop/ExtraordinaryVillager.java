package lab9;

public class ExtraordinaryVillager extends Villager {
    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String description;

        Skill(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }
    }

    private Skill skill;
    private int damage = 0;

    public ExtraordinaryVillager(String name, Integer age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I am " + this.name + " and I'm " + this.age + " years old. "
                + this.skill.getDescription());
    }

    public Skill getSkill() {
        return this.skill;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(damage);
    }

    @Override
    public void takeHit(int damage) {
        health = 0;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }
}
