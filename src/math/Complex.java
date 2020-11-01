package math;

public class Complex{
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex()
    {
        this(0, 0);
    }

    public void setReal(int real)
    {
        this.real = real;
    }

    public int getReal()
    {
        return real;
    }

    public void setImaginary(int imaginary)
    {
        this.imaginary = imaginary;
    }

    public int getImaginary()
    {
        return imaginary;
    }

    public Complex add(Complex number)
    {
        return new Complex(this.real + number.real, this.imaginary + number.imaginary);
    }

    public Complex subtract(Complex number)
    {
        return new Complex(this.real - number.real, this.imaginary - number.imaginary);
    }

    public Complex multiply(Complex number)
    {
        int parteReala = this.real * number.real - this.imaginary * number.imaginary;
        int parteImaginara = this.real * number.imaginary + this.imaginary * number.real;

        return new Complex(parteReala, parteImaginara);
    }

    public Complex scalarMultiply(int scalar)
    {
        return new Complex(scalar * this.real, scalar * this.imaginary);
    }

    @Override
    public String toString()
    {
        return this.real + " " + this.imaginary;
    }
}