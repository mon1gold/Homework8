package task1;

public class Wall extends Obstacle {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return "Wall";
    }
}
