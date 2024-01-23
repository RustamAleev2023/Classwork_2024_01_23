package task4;

public class Triangle extends Shape{
    int side1;
    int side2;

    public Triangle(int side1, int side2) {
        this.name = "Triangle";
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void square() {
        System.out.println(name + " square = " + (side1 * side2) / 2.0);
    }
}
