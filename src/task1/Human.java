package task1;

public class Human extends User {
    public Human(String name, double maxDistanceRun, double maxDistanceJump) {
        super(name, maxDistanceRun, maxDistanceJump);
    }

    @Override
    public boolean run(RaceTrack raceTrack) {
        System.out.println("Human run");
        return super.run(raceTrack);

    }

    @Override
    public boolean jump(Wall wall) {
        System.out.println("Human jump");

        return super.jump(wall);
    }
}


