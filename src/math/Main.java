package math;

public class Main {
    public static void main(String[] args)
    {
        Complex[] complexNumbers1 = new Complex[6];
        Complex[] complexNumbers2 = new Complex[6];
        Complex[] complexNumbers3 = new Complex[6];

        int[] real = {11, 10, 2, 13, 20, 3, 12, 16, 18, 9, 4, 8, 1, 14, 17, 15, 5, 7};
        int[] imaginary = {9, 10, 12, 8, 2, 19, 4, 20, 14, 15, 3, 16, 7, 17, 13, 18, 1, 5};

        int ind = 0;

        for(int i = 0; i < 6; i++)
        {
            complexNumbers1[i] = new Complex(real[ind], imaginary[ind]);
            ind++;
            complexNumbers2[i] = new Complex(real[ind], imaginary[ind]);
            ind++;
            complexNumbers3[i] = new Complex(real[ind], imaginary[ind]);
            ind++;
        }

        Matrice matrix1 = new Matrice(2, 3, complexNumbers1);
        Matrice matrix2 = new Matrice(2, 3, complexNumbers2);
        Matrice matrix3 = new Matrice(3, 2, complexNumbers3);

        System.out.println("Adunarea matricelor:");
        System.out.println("Matricea 1");
        matrix1.afisareMatrice();
        System.out.println("Matricea 2");
        matrix2.afisareMatrice();
        Matrice rezultat = matrix1.adunare((matrix2));
        System.out.println("Rezultat:");
        rezultat.afisareMatrice();

        System.out.println("Scaderea matricelor:");
        System.out.println("Rezultat:");
        rezultat = matrix1.scadere(matrix2);
        rezultat.afisareMatrice();

        System.out.println("Inmultirea matricelor:");
        System.out.println("Matricea 1");
        matrix1.afisareMatrice();
        System.out.println("Matricea 2");
        matrix3.afisareMatrice();
        System.out.println("Rezultat:");
        rezultat = matrix1.inmultireMatrici(matrix3);
        rezultat.afisareMatrice();

        System.out.println("Inmultirea cu scalarul 3: ");
        System.out.println("Matricea initiala:");
        matrix2.afisareMatrice();
        matrix2 = matrix2.inmultireScalar(3);
        System.out.println("Matricea dupa inmultirea cu scalarul 3");
        matrix2.afisareMatrice();
    }
}
