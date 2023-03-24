package task1;

public class RaceTrack extends Obstacle {
    private double distance;

    public RaceTrack(double distance, String name) {
        super(name);
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
       return participant.run(distance,getName());
    }
}
