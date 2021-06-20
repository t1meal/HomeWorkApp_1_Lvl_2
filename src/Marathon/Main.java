package Marathon;

import Marathon.Barrier.Course;
import Marathon.Barrier.CrossRun;
import Marathon.Barrier.JumpWall;
import Marathon.Barrier.SwimWater;
import Marathon.MembersOfMarafon.Cat;
import Marathon.MembersOfMarafon.Dog;
import Marathon.MembersOfMarafon.Human;
import Marathon.MembersOfMarafon.Team;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Марафонцы", new Cat ("Тузик"), new Dog("Лайка"), new Human("СуперГерой"));
        Course race = new Course("Первый забег", new CrossRun(300), new JumpWall(10), new SwimWater(15));
        race.startCourse(team);
        System.out.println();


        team.successfullyMembersInfo();
        System.out.println();

        team.allMembersInfo();
    }
}