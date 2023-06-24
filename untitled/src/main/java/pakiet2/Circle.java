package pakiet2;

/**
 * Klasa reprezentująca koło.
 */
public class Circle {
    private double radius;

    /**
     * Tworzy nowe koło o podanym promieniu.
     *
     * @param radius promień koła
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Oblicza pole powierzchni koła.
     *
     * @return pole powierzchni koła
     */
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Oblicza obwód koła.
     *
     * @return obwód koła
     */
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
