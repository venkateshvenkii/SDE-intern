public class BinarySearch
{
    static int searchBinarySearch(int array[], int target)
    {
        if(array == null || array.length == 0)
            return -1;

        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while(leftIndex <= rightIndex)
        {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if(array[midIndex] == target)
                return midIndex;

            if(array[midIndex] > target)
            {
                rightIndex = midIndex - 1;
            }
            else
            {
                leftIndex = midIndex + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int array[] = {10, 20, 30, 40, 50};

        int result = searchBinarySearch(array, 40);

        System.out.println("Target element found in = "+result);
    }
}
