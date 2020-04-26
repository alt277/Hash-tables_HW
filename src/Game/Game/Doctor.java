package Game.Game;

class Doctor extends Hero {
    protected int addHeal;

    public Doctor() {
        super();
        health = 500 + (int) (Math.random() * 10);
        damage = 20 + (int) (Math.random() * 17);
        addHeal = 100 + (int) (Math.random() * 50);
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            if (health <= 0) {
                System.out.println("Герой погиб и бить не может!");
            } else {
                if (hero.health > 0)
                    hero.causeDamage(damage);
                System.out.println("Доктор тоже может бить!");
            }

        }
    }

    @Override
    void healing(Hero hero) {
        if (hero != this) {
            hero.info();
            if (hero.health > 0) {
                hero.addHealth(addHeal);
                System.out.println("Доктор " + this.name + " лечит " + hero.name);
                hero.info();
            } else {
                System.out.println(hero.name + " мертвый ");
            }

        }
    }
}
