class SelectionSort
{
    public static void main(String[]args)
    {
        int[]arr={31,41,59,26,41,58};
        int key=0;
        for(int i=0;i<arr.length;i++)
        {
            key=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[key])
                {
                    key=j;      
                }
            }
            int temp=arr[key];
            arr[key]=arr[i];
            arr[i]=temp;
        }
        for(int x=0;x<arr.length;x++)
        System.out.println(arr[x]);
    }
}