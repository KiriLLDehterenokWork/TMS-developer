package Task2;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea(){
        return width * height;
    }
}
