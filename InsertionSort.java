class InsertionSort
{
    public static void main(String[]args)
    {
        int[]arr={31,41,59,26,41,58};
        int key=0,i;
        for(int j=1;j<arr.length;j++)
        {
            key=arr[j];
            i=j-1;
            while(i>=0 && arr[i]>key)
            {
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
        for(int x=0;x<arr.length;x++)
        System.out.println(arr[x]);
    }
}