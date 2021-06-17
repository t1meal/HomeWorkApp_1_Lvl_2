package Marathon.Barrier;

import Marathon.Interfaceses.Competitor;
import Marathon.MembersOfMarafon.Team;

public class Course {
    private String title;
    Obstacle course1 [] = new Obstacle[3];

    public Course(String title, int a, int b, int c){
        this.title = title;
        course1 [0] = new CrossRun(a);
        course1 [1] = new JumpWall(b);
        course1 [2] = new SwimWater(c);
    }

    public void startCourse(Team team){
        for(Obstacle stTeam : course1){
            for (Competitor competitor: team.getMembers()){
                if(competitor.isOnDistance()){
                    stTeam.doIt(competitor);
                }
            }
        }
    }

}
