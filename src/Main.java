public class Main {
    public static void main(String[] args) {
       Area[] figures = new Area[] {new Square(21,21), new Circle(15.5), new Triangle(13,17)};

        System.out.println("Sum of areas: " + calculateSumOfAreas(figures));

    }

    public static double calculateSumOfAreas(Area[] figures) {
        double sum = 0;
        for(Area figure : figures) {
            sum += figure.getArea();
        }
        return sum;
    }
}