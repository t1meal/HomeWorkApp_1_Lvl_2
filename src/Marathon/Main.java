package Marathon;

import Marathon.Barrier.Course;
import Marathon.MembersOfMarafon.Team;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Марафонцы");
        Course race = new Course("Первый забег", 200, 15, 10);
        race.startCourse(team);
        System.out.println();


        team.successfullyMembersInfo();
        System.out.println();

        team.allMembersInfo();
    }
}