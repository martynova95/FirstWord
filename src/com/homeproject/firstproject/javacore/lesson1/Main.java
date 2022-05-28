package com.homeproject.firstproject.javacore.lesson1;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Дикие");
        team1.infoAboutTheTeam();
        Team team2 = new Team("Быстрые");
        team2.infoAboutTheTeam();
        Course course = new Course();
        course.infoAboutTheObstacle();
        course.passObstacles(team1);
        course.passObstacles(team2);
        team1.passedDistance();
        team2.passedDistance();


    }
}
