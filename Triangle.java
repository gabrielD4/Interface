public class Triangle implements Shape{

    private int width;

    private int height;

    public Triangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void calculateArea() {
        int area = (width * height) / 2;
        System.out.println("Triangle width is: " + width + " and height is: " + height);
        System.out.println("The area of a triangle is (width * height) / 2 ");
        System.out.println("The triangle area is: " + area);
    }
}



