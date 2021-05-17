public class cleancode
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1000, 11, 445, 1, 330, 3000};
        int n = 6;
        int smallest;
        int largest;
        int i;
        if (n == 1)
        {
            smallest = arr[0];
            largest = arr[0];

        }
        if (arr[0] > arr[1])
        {
            smallest = arr[1];
            largest = arr[0];
        }
        else
        {
            smallest = arr[0];
            largest = arr[1];
        }
        for(i=2; i< arr.length; i++)
        {
            if(arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.printf("\na is %d", smallest);
        System.out.printf("\nb is %d", largest);
    }
}
