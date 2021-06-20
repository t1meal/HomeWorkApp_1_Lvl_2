package Marathon.MembersOfMarafon;

import Marathon.Interfaceses.Competitor;

public class Team {
     private String title;
     private Competitor[] members;


    public Team(String title, Competitor...competitors){
        this.title = title;
        this.members = competitors;

    }
    public void successfullyMembersInfo(){
        System.out.println("Участники состязания в игре:");
        for(int i = 0; i < members.length; i++){
            if(members[i].isOnDistance()){
                members[i].info();
            }
        }

    }
    public Competitor [] getMembers(){
        return members;
    }

    public void allMembersInfo(){
        System.out.println("Все участники состязания:");
        for(int i = 0; i < members.length; i++){
            members[i].info();
        }
    }
}
