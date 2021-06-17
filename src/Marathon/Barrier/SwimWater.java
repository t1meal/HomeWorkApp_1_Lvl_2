package Marathon.Barrier;

import Marathon.Interfaceses.Competitor;

public class SwimWater extends Obstacle {
    int length;

    public SwimWater(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
