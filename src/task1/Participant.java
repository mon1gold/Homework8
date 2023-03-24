package task1;

public abstract class Participant {
    private String name;

    private double maxDistanceRun;

    private double maxDistanceJump;

    public Participant(String name, double maxDistanceRun, double maxDistanceJump) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceJump = maxDistanceJump;
    }

    public String getName() {
        return name;
    }

    public boolean run(double distance, String obstacleName) {
        if (maxDistanceRun >= distance) {
            System.out.println("Учасник " + name + " пройшов перешкоду " + obstacleName + " на дистанції " + distance + " м");
            return true;
        } else {
            System.out.println("Учасник " + name + " не пройшов перешкоду " + obstacleName + " на дистанції " + distance + ". Пройдено " + maxDistanceRun);
            return false;
        }
    }

    public boolean jump(double height, String obstacleName) {
        if (maxDistanceJump >= height) {
            System.out.println("Учасник " + name + " пройшов перешкоду " + obstacleName + " на дистанції " + height + " м");
            return true;
        } else {
            System.out.println("Учасник " + name + " не пройшов перешкоду " + obstacleName + " на дистанції " + height + ". Пройдено " + maxDistanceJump);
            return false;
        }
    }
}