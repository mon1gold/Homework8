package task1;

public class Robot extends User {
    public Robot(String name, double maxDistanceRun, double maxDistanceJump) {
        super(name, maxDistanceRun, maxDistanceJump);
    }

    @Override
    public boolean run(RaceTrack raceTrack) {
        System.out.println("Robot run ");
        return super.run(raceTrack);
    }

    @Override
    public boolean jump(Wall wall) {
        System.out.println("Robot jump ");
        return super.jump(wall);
    }
}
