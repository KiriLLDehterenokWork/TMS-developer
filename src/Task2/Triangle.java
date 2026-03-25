package Task2;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    //Проверка треугольника на его существование(сумма двух сторон не меньше длины 3й стороны)
    private boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public Triangle(double sideA, double sideB, double sideC){
        if (!isTriangle(sideA, sideB, sideC)) {
            System.out.println("Треугольник с такими сторонами не существует!" + "Стороны: " + sideA + " " + sideB + " " + sideC);
        }

        this.a = sideA;
        this.b = sideB;
        this.c = sideC;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea(){
        double halfPerimeter = getPerimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
