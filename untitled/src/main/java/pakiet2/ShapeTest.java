package pakiet2;

import pakiet2.Circle;
import pakiet2.Rectangle;
import pakiet2.utils.StringUtils;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle circumference: " + circle.calculateCircumference());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        String palindrome = "Madam";
        System.out.println("Is '" + palindrome + "' a palindrome? " + StringUtils.isPalindrome(palindrome));
    }
}
