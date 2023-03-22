package task1;

public class Wall extends Obstacle {
    private double height;

    public Wall(double height, String name) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(height, getName());
    }
}
