class QuickSort
{
    public static void quicksort(int[]a, int low, int  high)
    {
        if(low<high)
        {
            int pi=partition(a,low,high);

            quicksort(a, low, pi-1);
            quicksort(a, pi+1, high);
        }
    }
    public static int partition(int[]a,int low, int high)
    {
        int pivot=a[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(a[j]<pivot)
            {
                i++;

                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;

        return i+1;
    }
    public static void main(String[]args)
    {
        int[]arr={31,41,59,26,41,58};
        quicksort(arr,0,arr.length-1);
        for(int  i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}