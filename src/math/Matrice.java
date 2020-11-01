package math;

public class Matrice {
    private Complex[][] elements;
    private int rows, columns;

    public Matrice(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;
        this.elements = new Complex[rows][columns];
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++) {
                elements[i][j] = new Complex(0, 0);
            }
        }
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Matrice(int rows, int columns, Complex[] complexNumbers)
    {
        this.rows = rows;
        this.columns = columns;
        this.elements = new Complex[rows][columns];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
                elements[i][j] = complexNumbers[i * columns+ j];
        }
    }

    public Matrice adunare(Matrice matrice2)
    {
        Matrice result = new Matrice(this.rows, this.columns);
        for(int i = 0; i < this.rows; i++)
        {
            for(int j = 0; j < this.columns; j++)
            {
                result.elements[i][j] = this.elements[i][j].add(matrice2.elements[i][j]);
            }
        }
        return result;
    }

    public Matrice scadere(Matrice matrice2)
    {
        Matrice result = new Matrice(this.rows, this.columns);
        for(int i = 0; i < this.rows; i++)
        {
            for(int j = 0; j < this.columns; j++)
            {
                result.elements[i][j] = this.elements[i][j].subtract(matrice2.elements[i][j]);
            }
        }
        return result;
    }

    public Matrice inmultireScalar(int scalar)
    {
        Matrice result = new Matrice(this.rows, this.columns);
        for(int i = 0; i < this.rows; i++)
        {
            for(int j = 0; j < this.columns; j++)
            {
                result.elements[i][j] = this.elements[i][j].scalarMultiply(scalar);
            }
        }
        return result;
    }

    //Functia asta o s-o folosesc si la scadere, fiindca este aceeasi conditie
    public boolean verificareAdunare(Matrice matrice2)
    {
        if(this.rows != matrice2.rows || this.columns != matrice2.columns)
            return false;
        return true;
    }

    public boolean verificareInmultire(Matrice matrice2)
    {
        if(this.columns != matrice2.rows)
            return false;
        return true;
    }

    public Matrice inmultireMatrici(Matrice matrice2)
    {

        Matrice result = new Matrice(this.rows, matrice2.columns);
        for(int i = 0; i < result.rows; i++)
        {
            for(int j = 0; j < result.columns; j++)
            {
                for(int k = 0; k < this.columns; k++)
                {
                    Complex c = this.elements[i][k].multiply(matrice2.elements[k][j]);
                    result.elements[i][j] = result.elements[i][j].add(c);
                }
            }
        }
        return result;
    }

    public void afisareMatrice()
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(elements[i][j].getReal() + " + " + elements[i][j].getImaginary() + "i ");
            }
            System.out.println();
        }
    }
}
