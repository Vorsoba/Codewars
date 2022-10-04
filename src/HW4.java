public class HW4
{
    public static void main(String[] arr)
    {
        int[][]array = new int[10][10];

        array[0][0] = 0;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 1; j < array[i].length; j++)
            {
                array[i][j] = array[i][j-1] + 1;
            }
        }
        for (int i = array.length - 1; i >= 0; i--)
        {
            for (int j = 0; j < array.length - 1 - i; j++)
            {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}