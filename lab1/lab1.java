
public class lab1 {
    public static void main(String[] args) {
        int Zalikova = 429;
        int C2 = Zalikova % 2;      //1 -
        int C3 = Zalikova % 3;      //0 
        int C5 = Zalikova % 5;      //4 -
        int C7 = Zalikova % 7;      //2 int
        // S = sum(a,n)(sum(b,m)((i-j)/i-0))
        // i = a -|->-ERROR|0|---|+ n => from 0(not incld) to n 
        // j = b -|---------|+ m  from b to m
        System.out.println("C2:"+C2 + " C3:" + C3 + " C5:" + C5 + " C7:" + C7);
        int C = C3;

        System.out.println("\n----- a < 0, Result: Error! -----");
        int a2 = -5;
        int n2 = 5;
        int b2 = 1;
        int m2 = 10;
        try{ Calculate(n2, m2, C, a2, b2); }catch(Error e){ System.out.println(e); }

        System.out.println("\n----- a = 0, Result: Error! -----");
        int a3 = 0;
        int n3 = 5;
        int b3 = 1;
        int m3 = 10;
        try{ Calculate(n3, m3, C, a3, b3); }catch(Error e){ System.out.println(e); }

        System.out.println("\n----- a > n, Result: Error! -----");
        int a4 = 10;
        int n4 = 5;
        int b4 = 1;
        int m4 = 10;
        try{ Calculate(n4, m4, C, a4, b4); }catch(Error e){ System.out.println(e); }

        System.out.println("\n----- b > m, Result: Error! -----");
        int a5 = 1;
        int n5 = 5;
        int b5 = 111;
        int m5 = 10;
        try{ Calculate(n5, m5, C, a5, b5); }catch(Error e){ System.out.println(e); }


        System.out.println("\n----- a=1, n=5, b=2, m=6 Result: -20.(6) -----");
        int a = 1;
        int n = 5;
        int b = 2;
        int m = 6;
        System.out.println(Calculate(n, m, C, a, b));
        
        System.out.println();

    }

    public static double Calculate(int n, int m, int C, int a, int b) {
        double S = 0;

        if(a <= 0)
            throw new Error("!ERROR!Division by zero!");
        if(n < a || m < b)
            throw new Error("!ERROR!start index of the iter must be greater than end index");     

        for (int i = a; i <= n ; i++ )
        {
            double Sum = 0;

            for(int j = b; j <= m ; j++)
            {
                Sum += ((i - j)/ (double)(i - C));
            }
            S += Sum;
        }

        return S;
    }
}

        