class Complex {
    int real;
    int imaginary;

    // Constructor
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Add two complex numbers
    public Complex add(Complex b) {
        return new Complex(this.real + b.real, this.imaginary + b.imaginary);
    }

    // Subtract two complex numbers
    public Complex difference(Complex b) {
        return new Complex(this.real - b.real, this.imaginary - b.imaginary);
    }

    // Multiply two complex numbers
    public Complex product(Complex b) {
        return new Complex(
            (this.real * b.real) - (this.imaginary * b.imaginary),
            (this.real * b.imaginary) + (this.imaginary * b.real)
        );
    }

// Print complex number in readable format
    public void printComplex() {
        if (real == 0 && imaginary != 0) {
            System.out.println(imaginary + "i");
        } else if (imaginary == 0 && real != 0) {
            System.out.println(real);
        } else if (real == 0 && imaginary == 0) {
            System.out.println(0);
        } else {
            System.out.println(real + " + " + imaginary + "i");
        }
    }
}

public class java_Oops_qs {
    public static void main(String[] args) {
        Complex c = new Complex(4, 6);
        Complex d = new Complex(3, -3);

        Complex added = c.add(d);
        Complex subtracted = c.difference(d);
        Complex multiplied = c.product(d);

        added.printComplex();       // Expected output: 7 + 3i
        subtracted.printComplex();  // Expected output: 1 + 9i
        multiplied.printComplex();  // Expected output: 30 + 6i
    }
}

