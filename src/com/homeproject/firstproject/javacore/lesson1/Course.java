package com.homeproject.firstproject.javacore.lesson1;

import java.util.Random;

public class Course {
    Let[] let = new Let[3];

    public Course() {
        Track track = new Track(15);
        Wall wall = new Wall(2);
        Pool pool = new Pool(10);
        let[0] = (Let) track;
        let[1] = (Let) wall;
        let[2] = (Let) pool;
    }

    public void infoAboutTheObstacle() {
        System.out.println("Length track: " + ((Track) let[0]).getLength());
        System.out.println("Height wall: " + ((Wall) let[1]).getHeight());
        System.out.println("Length pool: " + ((Pool) let[2]).getLength());
        System.out.println();
    }

    public void passObstacles(Team team) {
        for (Animal animal : team.teamAnimal) {
            for (Let l : let) {
                if (!l.doIt(animal)) {
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }
}
