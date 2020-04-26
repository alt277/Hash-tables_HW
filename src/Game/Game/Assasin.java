package Game.Game;

import java.util.Random;

class Assasin extends Hero {

  //  int cricitalHit;
    Random random = new Random();

    public Assasin() {
        super();
        health=500+(int)(Math.random()*50);
        damage= 250+(int) (Math.random()*50);
    }

    @Override
    void hit(Hero hero) {
        if (hero != this) {
            if(health <= 0) {
                System.out.println("Герой погиб и бить не может!");
            } else {
               if(hero.health>0)
                   hero.causeDamage(damage );
                System.out.println(this.name + " нанес урон " + hero.name);
            }
            hero.info();
        }
    }

    @Override
    void healing(Hero hero) {
        System.out.println("Убийцы не умеют лечить!");
    }
}