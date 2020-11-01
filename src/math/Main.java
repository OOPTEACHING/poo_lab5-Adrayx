package math;

public class Main {
    public static void main(String[] args)
    {
        Complex[] complexNumber1 = new Complex[6];
        Complex[] complexNumber2 = new Complex[6];
        Complex[] complexNumber3 = new Complex[6];

        int[] real = {11, 10, 2, 13, 20, 3, 12, 16, 18, 9, 4, 8, 1, 14, 17, 15, 5, 7};
        int[] imaginary = {9, 10, 12, 8, 2, 19, 4, 20, 14, 15, 3, 16, 7, 17, 13, 18, 1, 5};

        int ind = 0;

        for(int i = 0; i < 6; i++)
        {
            complexNumber1[i] = new Complex(real[ind], imaginary[ind]);
            ind++;
            complexNumber2[i] = new Complex(real[ind], imaginary[ind]);
            ind++;
            complexNumber3[i] = new Complex(real[ind], imaginary[ind]);
            ind++;
        }

        Matrice matrice1 = new Matrice(2, 3, complexNumber1);
        Matrice matrice2 = new Matrice(2, 3, complexNumber2);
        Matrice matrice3 = new Matrice(3, 2, complexNumber3);

        System.out.println("Adunarea matricelor:");
        System.out.println("Matricea 1");
        matrice1.afisareMatrice();
        System.out.println("Matricea 2");
        matrice2.afisareMatrice();
        Matrice rezultat = matrice1.adunare((matrice2));
        System.out.println("Rezultat:");
        rezultat.afisareMatrice();

        System.out.println("Scaderea matricelor:");
        System.out.println("Rezultat:");
        rezultat = matrice1.scadere(matrice2);
        rezultat.afisareMatrice();

        System.out.println("Inmultirea matricelor:");
        System.out.println("Matricea 1");
        matrice1.afisareMatrice();
        System.out.println("Matricea 2");
        matrice3.afisareMatrice();
        System.out.println("Rezultat:");
        rezultat = matrice1.inmultireMatrici(matrice3);
        rezultat.afisareMatrice();

        System.out.println("Inmultirea cu scalarul 3: ");
        System.out.println("Matricea initiala:");
        matrice2.afisareMatrice();
        matrice2 = matrice2.inmultireScalar(3);
        System.out.println("Matricea dupa inmultirea cu scalarul 3");
        matrice2.afisareMatrice();
    }
}
