package Marathon.Barrier;

import Marathon.Interfaceses.Competitor;
import Marathon.MembersOfMarafon.Team;

public class Course {
    private String title;
    Obstacle course1 [];

    public Course(String title, Obstacle...course){
        this.title = title;
        this.course1 = course;
    }

    public void startCourse(Team team){
        System.out.println("Начинаем полосу препятствий!");
        for(Competitor competitor: team.getMembers()){
            for (Obstacle stTeam : course1){
                if(competitor.isOnDistance()){
                    stTeam.doIt(competitor);
                }
            }
        }
    }


}
