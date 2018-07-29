public class Exer7_DiagonalOS {

    public static void main(String[] args)
    {
        final char O_Char = 'O';
        final char Space = ' ';
        final int Rows = 10;
        int spaces = 0;
        int a, b;
        for(a = 0; a < Rows; ++a)
        {
            for(b = 0; b < spaces; ++b)
                System.out.print(Space);
            System.out.println(O_Char);
            spaces++;
        }
    }
}