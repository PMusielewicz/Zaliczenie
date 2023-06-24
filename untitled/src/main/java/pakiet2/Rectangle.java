package pakiet2;

/**
 * Klasa reprezentująca prostokąt.
 */
public class Rectangle {
    private double length;
    private double width;

    /**
     * Tworzy nowy prostokąt o podanej długości i szerokości.
     *
     * @param length długość prostokąta
     * @param width  szerokość prostokąta
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Oblicza pole powierzchni prostokąta.
     *
     * @return pole powierzchni prostokąta
     */
    public double calculateArea() {
        return length * width;
    }

    /**
     * Oblicza obwód prostokąta.
     *
     * @return obwód prostokąta
     */
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
