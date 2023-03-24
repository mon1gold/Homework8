public class Triangle implements Area {
    private double height;
    private double length;

    public Triangle(double height, double length) {
        this.height = height;
        this.length = length;

    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length * height / 2;
    }
}
