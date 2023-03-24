public class Square implements Area {
    private  double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
