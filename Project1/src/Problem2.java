public class Problem2
{
    public static void main(String[] args)
    {
        //Run1(100000);
        Run2(100000);
    }

    public static void Run1(int size)
    {
        long start = System.nanoTime();
        int n = size;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + i;
        }
        long end= System.nanoTime();
        System.out.println(end-start);
    }

    public static void Run2(int size)
    {
        long start = System.nanoTime();
        int n = size;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i*i; j++)
            {
                sum = sum + i;
            }
        }
        long end= System.nanoTime();

        System.out.println(end-start);
    }
}
