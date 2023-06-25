public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex other) {
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
        double newReal = ((this.real * other.real) + (this.imaginary * other.imaginary)) / denominator;
        double newImaginary = ((this.imaginary * other.real) - (this.real * other.imaginary)) / denominator;
        return new Complex(newReal, newImaginary);
    }

    public double modulus() {
        return Math.sqrt((this.real * this.real) + (this.imaginary * this.imaginary));
    }

    public double argument() {
        return Math.atan2(this.imaginary, this.real);
    }

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Необхідно ввести 4 числа у командному рядку.");
            return;
        }

        double realPart1 = Double.parseDouble(args[0]);
        double imaginaryPart1 = Double.parseDouble(args[1]);
        double realPart2 = Double.parseDouble(args[2]);
        double imaginaryPart2 = Double.parseDouble(args[3]);

        Complex complex1 = new Complex(realPart1, imaginaryPart1);
        Complex complex2 = new Complex(realPart2, imaginaryPart2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
        Complex quotient = complex1.divide(complex2);
        double modulus1 = complex1.modulus();
        double modulus2 = complex2.modulus();
        double argument1 = complex1.argument();
        double argument2 = complex2.argument();

        System.out.println("Сума: " + sum.real + " + " + sum.imaginary + "i");
        System.out.println("Різниця: " + difference.real + " + " + difference.imaginary + "i");
        System.out.println("Добуток: " + product.real + " + " + product.imaginary + "i");
        System.out.println("Частка: " + quotient.real + " + " + quotient.imaginary + "i");
        System.out.println("Модуль першого числа: " + modulus1);
        System.out.println("Модуль другого числа: " + modulus2);
        System.out.println("Аргумент першого числа: " + argument1);
        System.out.println("Аргумент другого числа: " + argument2);
    }
}
