public class Problem5
{
    public static void main(String args[])
    {
        int []list = {9,8,7,6,5,4,3,2,1,0};

        //tests for numbers 10 through 0
        System.out.println("List of digits 9-0");
        for(int i=10; i>-1; i--)
        {
            System.out.println(binarySearch(list, 0, list.length - 1, i));
        }

        int []emptylist = {};
        System.out.println("Empty List");
        System.out.println(binarySearch(emptylist, 0, emptylist.length - 1, 8));

    }

    static int binarySearch(int array[], int left, int right, int num)
    {
        if (right >= left)
        {
            int middle = left + (right - left) / 2;

            if (array[middle] == num)
            {
                return middle;
            }

            if (array[middle] < num)
            {
                return binarySearch(array, left, middle - 1, num);
            }

            return binarySearch(array, middle + 1, right, num);
        }

        return -1;
    }
}
