package homework_nr_4;

public class Circle {

    // Атрибуты
    static int radius;

    // Конструктор
    public Circle (int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        circle1.calculateArea();
    }

    // метод calculateArea
    public static void calculateArea() {
        float A = (float) (3.14 * radius * radius);
        System.out.println("Радиус: " + radius + "см");
        System.out.println("Площадь треугольника: " + A + "см" );
    }

}
