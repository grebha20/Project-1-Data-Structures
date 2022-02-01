public class Problem3
{
    public static void main(String[] args)
    {
        Integer [] normal= new Integer[]{9,1,3,5,2,7,6,0,4,8};
        Integer [] repeats= new Integer[]{9,1,1,3,5,2,8,6,0,4,8};
        Integer [] empty = new Integer[]{};

        Integer [] sorted1= sort(normal);
        Integer [] sorted2= sort(repeats);
        Integer [] sorted3= sort(empty);

        System.out.println("Normal Array");
        for(int i=0; i<sorted1.length; i++)
        {
            System.out.print(sorted1[i] +" ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Array with Repeats");
        for(int i=0; i<sorted2.length; i++)
        {
            System.out.print(sorted2[i] +" ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Empty Array (sort returns an array containing -1 if empty)");
        for(int i=0; i<sorted3.length; i++)
        {
            System.out.print(sorted3[i] +" ");
        }
    }

    public static Integer[] sort(Integer[] unsorted)
    {
        if(unsorted.length==0)
        {
            unsorted= new Integer[]{-1};
        }

        for(int i=0; i<unsorted.length;i++)
        {
            for(int j=0; j<unsorted.length; j++)
            {
                if(unsorted[i]>=unsorted[j])
                {
                    int sort=unsorted[i];
                    unsorted[i]=unsorted[j];
                    unsorted[j]=sort;
                }
            }
        }
        return unsorted;
    }
}
