package task4;

public class Rectangle extends Shape{
    int side1;
    int side2;
    public Rectangle(int side1, int side2) {
        this.name = "Rectangle";
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void square() {
        System.out.println(name + " square = " + side1 * side2);

    }
}
