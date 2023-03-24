package task1;

public class Competition {
    public void start(Participant[] participants, Obstacle[] obstacles) {
        for (Obstacle obstacle : obstacles) {
            for (int i = 0; i < participants.length; i++) {
                if (participants[i] == null) {
                    continue;
                }

                if (!obstacle.overcome(participants[i])) {
                    participants[i] = null;
                }
            }
        }
    }
}

