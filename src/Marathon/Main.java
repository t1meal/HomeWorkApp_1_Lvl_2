package Marathon;

import Marathon.Barrier.Course;
import Marathon.Interfaceses.Competitor;
import Marathon.MembersOfMarafon.Team;

public class Main {
    public static void main(String[] args) {
//       Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        Obstacle[] course = {new Cross(80), new Wall(2), new Wall(1), new Cross(120)};
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
//        }
//        for (Competitor c : competitors) {
//            c.info();
//        }
        Team team = new Team("Марафонцы");
        Course race = new Course("Первыйц забег", 600, 15, 10);
        race.startCourse(team);
        team.successfullyMembersInfo();
        System.out.println();
        team.allMembersInfo();

    }
}