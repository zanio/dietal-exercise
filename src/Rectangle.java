public class Rectangle {
    private int length;
    private int breadth;
    private int perimeter;
    private int area;


    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle() {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return area;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public int calcuateReactangleArea() {
        int Area = length * breadth;
        this.area = Area;
        return Area;

    }

    public int calcuateReactanglePerimeter() {
        int Perimeter = 2 * (length + breadth);
        this.perimeter = Perimeter;
        return Perimeter;

    }
}