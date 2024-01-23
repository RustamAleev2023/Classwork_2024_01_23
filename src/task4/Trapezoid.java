package task4;

public class Trapezoid extends Shape{
    int a;
    int b;
    int h;

    public Trapezoid(int a, int b, int h) {
        this.name = "Trapezoid";
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public void square() {
        System.out.println(name + " square = " + (((a - b) * h) / 2.0));
    }
}
