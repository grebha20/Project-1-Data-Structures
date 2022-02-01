import java.util.ArrayList;

public class Problem5
{
    public static void main(String[] args)
    {
        Integer [] normal= new Integer[]{9,8,7,6,5,4,3,2,1,0};
        Integer [] empty = new Integer[]{};

        System.out.println("Normal Array");
        for(int i=9; i>-1; i--)
        {
            System.out.println(search(normal,i, 0, normal.length));
        }

        System.out.println();

        System.out.println("Empty Array");
        System.out.println(search(empty,7, 0, empty.length));
    }

    public static int search(Integer[] list,int num, int left, int right)
    {
        if(list.length==0)
        {
            return -1;
        }
        int middle=(left+right)/2;

        //if(left>=0 && right<=list.length)
        {
            if(list[middle]==num)
            {
                return middle;
            }
            else if(list[middle]<num)
            {
                search(list,num, left, middle);
            }
            else if(list[middle]>num)
            {
                search(list, num, middle, right);
            }
        }

        return -1;
    }
}
