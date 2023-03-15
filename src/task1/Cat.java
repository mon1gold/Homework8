package task1;

public class Cat extends User {

    public Cat(String name, double maxDistanceRun, double maxDistanceJump) {
        super(name, maxDistanceRun, maxDistanceJump);
    }

    @Override
    public boolean run(RaceTrack raceTrack) {
        System.out.println("Cat run ");
        return super.run(raceTrack);

    }

    @Override
    public boolean jump(Wall wall) {
        System.out.println("Cat jump ");
        return super.jump(wall);
    }
}
