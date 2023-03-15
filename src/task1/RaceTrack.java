package task1;

public class RaceTrack extends Obstacle {
    private double distance;

    public RaceTrack(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public String getName() {
        return "racetrack";
    }
}
