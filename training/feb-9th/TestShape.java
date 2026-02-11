interface Shape {
    int calculateArea();
}

class Circle implements Shape {

    int radius;

    Circle(int r) {
        radius = r;
    }

    public int calculateArea() {
        return (int)(3.14 * radius * radius);
    }
}

class Square implements Shape {

    int side;

    Square(int s) {
        side = s;
    }

    public int calculateArea() {
        return side * side;
    }
}

class TestShape {
    public static void main(String[] args) {

        Shape shape1 = new Circle(7);
        Shape shape2 = new Square(6);

        System.out.println(shape1.calculateArea());
        System.out.println(shape2.calculateArea());
    }
}
