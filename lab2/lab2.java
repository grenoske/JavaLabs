package JavaLabs.lab2;

public class lab2 {
    public static void main(String[] artgs)
    {
        int Zalikova = 429;
        int C5 = Zalikova % 5;      //4 Дія з матрицею: С=AxB
        int C7 = Zalikova % 7;      //2 Тип елементів: short
        int C11 = Zalikova % 11;    //0 Дія з матрицею: Обчислити 
                                    //суму найменших елементів кожного
                                    // стовпця матриці

        System.out.println("C5:"+C5 + " C7:" + C7 + " C11:" + C11);


        System.out.println("\n  --Check negative rows or columns; Result: Error");
        int rA3 = -5, cA3 = 5;      // negative rows for A3
        try{ Matrix A3 = new Matrix(rA3, cA3);}catch(Error er){ System.out.println(er); }


        System.out.println("\n  --Check A(1x1) ConcreteFill Array(2x2); Result: Error");
        int rA6 = 1, cA6 = 1;       // too small size for 2x2 array
        Matrix A6 = new Matrix(rA6, cA6);
        short shorts[][] = new short[][]{{1,2},{3,4}};
        try{ A6.concreteFill(shorts);}catch(Error er){ System.out.println(er); }


        System.out.println("\n  --Check A(5x5) ConcreteFill Array(5x5); Result: A(5x5)");
        int rA7 = 5, cA7 = 5;
        Matrix A7 = new Matrix(rA7, cA7);
        short shorts2[][] = new short[][]{{1, -1, 0, 1, -19},
                                          {0, 0, 0, -1, 1},
                                          {-2, 0, 1, 1, 5},
                                          {0, 1, 1, -1, 1},
                                          {3, 0, 0, -1, 1}};
        A7.concreteFill(shorts2);
        A7.show();


        System.out.println("\n  --Check A(5x1) * B(5x1); Result: Error");
        int rA2 = 5, cA2 = 1, rB2 = 5, cB2 = 1;
        short num2 = 1;
        Matrix A2 = new Matrix(rA2, cA2);
        A2.oneNumberFill(num2);
        Matrix B2 = new Matrix(rB2, cB2);   // Rows of B must be equal to Col of A
        B2.oneNumberFill(num2);
        try{ Matrix C2 = A2.operator_multiply(A2, B2);}catch(Error er){ System.out.println(er);}

        /* 
        System.out.println("  --Check A(null) * B(5x1) Result: Error");
        int rB4 = 5, cB4 = 1;
        short num4 = 1;
        Matrix A4 = null;
        Matrix B4= new Matrix(rB4, cB4);
        B4.oneNumberFill(num4);
        try{ Matrix C4 = A4.operator_multiply(A4, B4);}catch(Error er){ System.out.println(er);}
        */


        System.out.println("\n  --Check A(1x5) * B(5x1); Result: C(1x1)");
        int rA5 = 1, cA5 = 5, rB5 = 5, cB5 = 1;
        short num5 = 1;
        Matrix A5 = new Matrix(rA5, cA5);
        A5.oneNumberFill(num5);
        Matrix B5 = new Matrix(rB5, cB5);
        B5.oneNumberFill(num5);
        Matrix C6 = A5.operator_multiply(A5, B5);
        C6.show();

        
        System.out.println("\n  --Check A(5x5) * B(5x1); Result: C(5x1)");
        int rA = 5, cA = 5, rB = 5, cB = 1;
        short num = 1;
        Matrix A = new Matrix(rA, cA);
        A.oneNumberFill(num);
        Matrix B = new Matrix(rB, cB);
        B.oneNumberFill(num);
        Matrix C = A.operator_multiply(A, B);
        C.show();


        System.out.println("\n  --Check A7(5x5) * B7(5x7); Result: C(5x7)");
        Matrix B7 = new Matrix(5, 7);
        short num7 = 1;
        B7.oneNumberFill(num7);
        Matrix C8 = A.operator_multiply(A7, B7);
        C8.show();


        System.out.println("\n  --Check C(5x1).sumOfMinElementsOfEveryCol; Result: 5");
        short res = C.sumOfMinElementsOfEveryCol();
        System.out.println(res);


        System.out.println("\n  --Check C8(5x7).sumOfMinElementsOfEveryCol; Result: -18*7 = -126");
        short res2 = C8.sumOfMinElementsOfEveryCol();
        System.out.println(res2);

    }

    
}
