import java.util.Scanner;

public class Exer2_CountByAnything {

    public static void main (String args[])
    {
        final int STOP = 200;
        final int Num_per_line;
        Scanner input = new Scanner(System.in);
        int stepValue;
        System.out.print("Enter number to count by: ");
        stepValue = input.nextInt();
        Num_per_line = stepValue * 10;
        for(int i = stepValue; i <= STOP; i += stepValue)
        {
            System.out.print(i + "  ");
            if(i % Num_per_line == 0)
                System.out.println();
        }
    }
}