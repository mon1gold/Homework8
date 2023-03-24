package task1;

public class Main {
    private static Participant[] participants = {new Human("Ban", 50, 2),
            new Cat("Kasper", 100, 3),
            new Robot("R2D2", 150, 1),
            new Robot("Optimus Prime", 500, 6)};
    private static Obstacle[] obstacles = {new RaceTrack(48,"Race Track1"),
            new Wall(1, "Wall 1"),
            new RaceTrack(80, "Race Track 2"),
            new Wall(2, "Wall 2"),
            new RaceTrack(100, "Race Track 3"),
            new Wall(5,"Wall 3")};

    public static void main(String[] args) {
        new Competition().start(participants, obstacles);
        System.out.println();
        printWinners();

    }
    public static void printWinners() {
        for (Participant participant : participants) {
            if (participant != null) {
                System.out.println(participant.getName() + " пройшов усі перешкоди!");
            }
        }
    }
}
