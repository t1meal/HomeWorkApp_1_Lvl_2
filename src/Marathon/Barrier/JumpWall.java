package Marathon.Barrier;

import Marathon.Interfaceses.Competitor;

public class JumpWall extends Obstacle {
    int height;

    public JumpWall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
