package Override_methods;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        square.setLength(6);

        rectangle.setLength(5);
        rectangle.setWidth(5);

        System.out.println(rectangle.perimeter());
        System.out.println(square.perimeter());
    }
}
