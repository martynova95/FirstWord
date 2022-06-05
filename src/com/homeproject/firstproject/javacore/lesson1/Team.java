package com.homeproject.firstproject.javacore.lesson1;

import java.util.Random;

public class Team {
    private String nameTeam = "unknown";
    Animal[] zoo = {new Cat("Murzik", 20, 9, 5), new Cat("Barsik", 16, 10, 3), new Mouse("Jerry", 16, 1), new Elephant("Dambo", 25, 10)};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for (int i = 0; i < 4; i++) {
            int ran = random.nextInt(3);
            teamAnimal[i] = zoo[ran];
        }
    }



    public void infoAboutTheTeam() {
        System.out.println("Team: " + nameTeam);
        for (Animal a : teamAnimal) {
            System.out.println(a);
            System.out.println("Run limit: " + a.runLimit);
            if (a instanceof Swimable)
                System.out.println("Swim limit: " + ((Swimable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Jump limit: " + ((Jumpable) a).getJumpLimit());
        }
       System.out.println();
    }

    public void passedDistance() {
        System.out.println(nameTeam + "\n");
        for (Animal a : teamAnimal) {
            if (a.passing) {
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();
    }
}
