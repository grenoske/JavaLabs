package JavaLabs.lab2;

public class Matrix {
    private short dArr[][];

    public Matrix(int nRow, int nCol)
    {
        if(nRow <= 0 || nCol <= 0)
        {
            throw new Error("!ERRORRRRRRR! matrix colums or rows is <= 0");
        }
        dArr = new short[nRow][];

        for (int i = 0; i < nRow; i++)
            dArr[i] = new short[nCol];
    }

    public Matrix operator_multiply(Matrix MA, Matrix MB)
    {
        /* 
        if(MA == null || MB == null)
            throw new Error("!ERRORRRRRRR! Matrix is null!");
        */
        if(MA.dArr[0].length != MB.dArr.length)
        {
            throw new Error("!ERRORRRRRRR! MA's Cols != MB's Rows");
        }
        Matrix result = 
            new Matrix(MA.dArr.length, MB.dArr[0].length);

        short temp;
        for (int i = 0; i < MA.dArr.length; i++)
        {
            for (int j = 0; j < MB.dArr[0].length; j++)
            {
                temp = 0;
                for(int k = 0; k < MA.dArr[0].length; k++)
                {
                    temp += MA.dArr[i][k] * MB.dArr[k][j];   
                }
                result.dArr[i][j] = temp;
            }
        }

        return result;
    }

    public short sumOfMinElementsOfEveryCol()
    {
        short sumOfMinInRows = 0;

        for (int i = 0; i < dArr[0].length; i++)
        {
            short min = dArr[0][i];              // min of i's row
            for(int j = 1; j < dArr.length; j++)
                if(min > dArr[j][i])
                    min = dArr[j][i]; 
            
            sumOfMinInRows += min;
        }

        return sumOfMinInRows;
    }

    public void show()
    {
        for (int i = 0; i < dArr.length; i++)
        {
            for (int j = 0; j < dArr[0].length; j++)
            {
                System.out.print(dArr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void oneNumberFill(short number)
    {
        for (int i = 0; i < dArr.length; i++)
            for (int j = 0; j < dArr[0].length; j++)
                dArr[i][j] = number;
    }
    
    public void concreteFill(short[][] shorts)
    {
        if(shorts.length != dArr.length || shorts[0].length != dArr[0].length)
            throw new Error("!ERRORRRRRRR! matrix have another size!");
        dArr = new short[shorts.length][];

        for (int i = 0; i < shorts.length; i++)
            dArr[i] = new short[shorts[0].length];

        for (int i = 0; i < shorts.length; i++)
            for (int j = 0; j < shorts[0].length; j++)
                dArr[i][j] = shorts[i][j];
    }
}
