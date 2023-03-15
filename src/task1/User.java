package task1;

public abstract class User {
    private String name;

    private double maxDistanceRun;

    private double maxDistanceJump;

    public User(String name, double maxDistanceRun, double maxDistanceJump) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceJump = maxDistanceJump;
    }

    public String getName() {
        return name;
    }

    public boolean run(RaceTrack raceTrack) {
        if (maxDistanceRun >= raceTrack.getDistance()) {
            System.out.println("Учасник " + name + " пройшов перешкоду " + raceTrack.getName() + " на дистанції " + raceTrack.getDistance() + " м");
            return true;
        } else {
            System.out.println("Учасник " + name + " не пройшов перешкоду " + raceTrack.getName() + " на дистанції " + raceTrack.getDistance() + ". Пройдено " + maxDistanceRun);
            return false;
        }
    }

    public boolean jump(Wall wall) {
        if (maxDistanceJump >= wall.getHeight()) {
            System.out.println("Учасник " + name + " пройшов перешкоду " + wall.getName() + " на дистанції " + wall.getHeight() + " м");
            return true;
        } else {
            System.out.println("Учасник " + name + " не пройшов перешкоду " + wall.getName() + " на дистанції " + wall.getHeight() + ". Пройдено " + maxDistanceJump);
            return false;
        }
    }
}