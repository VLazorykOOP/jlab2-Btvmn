import java.util.Scanner;

public class Cone {
    private final double height;
    private final double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getLateralSurfaceArea() {
        double slantHeight = Math.sqrt(height * height + radius * radius);
        return Math.PI * radius * slantHeight;
    }

    public double getVolume() {
        return (Math.PI * radius * radius * height) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть висоту конуса: ");
        double height = scanner.nextDouble();

        System.out.print("Введіть радіус основи конуса: ");
        double radius = scanner.nextDouble();

        Cone cone = new Cone(height, radius);

        double lateralSurfaceArea = cone.getLateralSurfaceArea();
        double volume = cone.getVolume();

        System.out.println("Площа бічної поверхні конуса: " + lateralSurfaceArea);
        System.out.println("Об'єм конуса: " + volume);
    }
}
