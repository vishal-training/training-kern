class Rectangle {

    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println(rect.calculateArea());
    }
}


