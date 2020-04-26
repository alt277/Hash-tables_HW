package Game.Game;

import java.util.Random;

class Game {
    public static void main(String[] args) {

        Random randomStep = new Random();
        Random randomHealing = new Random();
        int players=5;

        Team team1 =new Team(players);
        Team team2 =new Team(players);



        for (Hero t1: team1.team) {
            t1.info();
        }
        System.out.println("----------");
        for (Hero t2: team2.getTeam()) {
            t2.info();
        }
        System.out.println("----------");

  int jo=0;
        while ( team1.counter>0 &&  team2.counter >0) {

                for (int i = 0; i < players; i++) {
                    Random rnd = new Random();

                    int chooseFirst = rnd.nextInt(players);
                    int chooseSecond = rnd.nextInt(players);

                    if (randomStep.nextInt(2) == 0) {

                        if (team1.team[i] instanceof Doctor) {
                            team1.team[i].healing(team1.team[randomHealing.nextInt(players)]);
                            team1.team[i].hit(team2.team[chooseSecond]);

                        } else if (team2.team[chooseSecond].health > 0 ) {
                            System.out.println("counter2= " + team2.counter);
                            team1.team[i].hit(team2.team[chooseSecond]);

                            if ((team2.team[chooseSecond].health <= 0) && (team2.counter > 0)) {
                                team2.counter--;

                                System.out.println("counter2= " + team2.counter);
                            }
                        }

                    } else {

                        if (team2.team[i] instanceof Doctor) {
                            team2.team[i].healing(team2.team[randomHealing.nextInt(players)]);
                            //                       team2.team[i].hit(team1.team[i]);
                        } else if (team1.team[chooseFirst].health > 0) {
                            System.out.println("counter1= " + team1.counter);
                            team2.team[i].hit(team1.team[chooseFirst]);
                            if ((team1.team[chooseFirst].health <= 0) && (team1.counter > 0)) {
                                team1.counter--;
                                System.out.println("counter1= " + team1.counter);
                            }
                        }
                    }
                }
            }


        System.out.println("--------");
        for (Hero t1: team1.team) {
            t1.info();
        }
        System.out.println("--------");
        for (Hero t2: team2.team) {
            t2.info();
        }
        System.out.println("----------");
        if (team1.counter> team2.counter)
            System.out.println("Победила команда 1.  В живых осталось: "+team1.counter);
        else
            System.out.println("Победила команда 2 на счету "+team2.counter);
        System.out.println("счетчик команды #1  "+team1.counter);
        System.out.println("счетчик команды #2  "+team2.counter);

    }
}