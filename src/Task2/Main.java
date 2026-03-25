package Task2;

public class Main {
    public static void main(String[] args){

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(5,5,11);
        figures[1] = new Triangle(4,5,11);
        figures[2] = new Rectangle(5,15);
        figures[3] = new Rectangle(7,8);
        figures[4] = new Circle(12);

        System.out.println("Площадь треугольника: " + figures[0].getArea() + ", периметр: " + figures[0].getPerimeter());
        System.out.println("Площадь треугольника: " + figures[1].getArea() + ", периметр: " + figures[1].getPerimeter());
        System.out.println("Площадь прямоугольника: " +figures[2].getArea() + ", периметр: " + figures[2].getPerimeter());
        System.out.println("Площадь прямоугольника: " + figures[3].getArea() + ", периметр: " + figures[3].getPerimeter());
        System.out.println("Площадь круга: " + figures[4].getArea() + ", периметр: " + figures[4].getPerimeter() + "\n");

        double sumPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            sumPerimeter += figures[i].getPerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + sumPerimeter);
    }
}
