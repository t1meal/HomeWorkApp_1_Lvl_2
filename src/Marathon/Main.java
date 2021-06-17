package Marathon;

import Marathon.Barrier.Course;
import Marathon.Interfaceses.Competitor;
import Marathon.MembersOfMarafon.Team;

public class Main {
    public static void main(String[] args) {
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
        Team team = new Team("Марафонцы");
        Course race = new Course("Первый забег", 200, 15, 10);
        race.startCourse(team);
        System.out.println();
        team.successfullyMembersInfo();
        System.out.println();
        team.allMembersInfo();
    }
}