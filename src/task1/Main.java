package task1;

public class Main {
    private static User[] users = {new Human("Ban", 50, 2),
            new Cat("Kasper", 100, 3),
            new Robot("R2D2", 150, 1),
            new Robot("Optimus Prime", 500, 6)};
    private static Obstacle[] obstacles = {new RaceTrack(48),
            new Wall(1),
            new RaceTrack(80),
            new Wall(2),
            new RaceTrack(100),
            new Wall(5)};

    public static void main(String[] args) {
        startChallenge();
        System.out.println();
        printWinners();

    }

    public static void startChallenge() {
        for (Obstacle obstacle : obstacles) {
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null) {
                    continue;
                }
                if (obstacle instanceof RaceTrack) {
                    if (!users[i].run((RaceTrack) obstacle)) {
                        users[i] = null;
                    }

                } else {
                    if (!users[i].jump((Wall) obstacle)) {
                        users[i] = null;
                    }
                }

            }
        }
    }

    public static void printWinners() {
        for (User user : users) {
            if (user != null) {
                System.out.println(user.getName() + " пройшов усі перешкоди!");
            }
        }
    }
}
