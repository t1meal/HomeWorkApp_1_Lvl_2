package Marathon.Barrier;

import Marathon.Interfaceses.Competitor;
import Marathon.MembersOfMarafon.Team;

public class CrossRun extends Obstacle {
    int length;

    public CrossRun(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }

}
