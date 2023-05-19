package lab9;

public class Monsters {
    static final Monster andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            if(getHealth() <= 0) {
                return;
            }

            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            if(getHealth() - damage < 0) {
                setHealth(0);
            } else {
                setHealth(getHealth() - damage);
            }

            Monsters.monstersHealth = getHealth() + blacksmith.getHealth();
        }
    };

    static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            if(getHealth() <= 0) {
                return;
            }

            victim.takeHit(5 + getDamage());
        }

        @Override
        public void takeHit(int damage) {
            if(getHealth() - damage < 0) {
                setHealth(0);
            } else {
                setHealth(getHealth() - damage);
            }

            Monsters.monstersHealth = getHealth() + andariel.getHealth();
        }
    };

    static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();
}
