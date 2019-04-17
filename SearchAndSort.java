
/**
 * Write a description of class SearchAndSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SearchAndSort
{
    private int[] list;

    // pre: none
    // post: people is sorted using insertion sort
    private void sortContacts()
    {
        int temp = 0;

        for (int i = 1; i < list.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(list[j] < list[j-1])
                {
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
    }

    // pre: none
    // post: Person is found (using Binary Search) and
    //          returned from list that has name (using compareTo)
    public int getContact(int val)
    {
        int start = 0;
        int end = list.length - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (val == list[mid])
            {
                return mid;
            }

            if (val < list[mid])
            {
                end = mid - 1;
            }

            else
            {
                start = mid + 1;
            }
        }

        return -1;
    }
}
