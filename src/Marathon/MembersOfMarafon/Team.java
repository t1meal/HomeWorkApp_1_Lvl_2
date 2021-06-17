package Marathon.MembersOfMarafon;

import Marathon.Interfaceses.Competitor;

public class Team {
     private String title;
     private Competitor[] members = new Competitor[4];


    public Team(String title){
        this.title = title;
        members[0] = new Cat("Пушистик");
        members[1] = new Dog("Лайка");
        members[2] = new Cat("Барсик");
        members[3] = new Human("Алеша Попович");
    }
    public void successfullyMembersInfo(){
        for(int i = 0; i < 4; i++){
            if(members[i].isOnDistance()){
                members[i].info();
            }
        }
    }

    public Competitor [] getMembers(){
        return members;
    }

    public void allMembersInfo(){
        for(int i = 0; i < 4; i++){
            members[i].info();
        }
    }
}
