class bubblesort{
    public static void sort(int[] arr) {
           for(int turn=1;turn<arr.length;turn++)
         {
           for(int i=0;i<arr.length-turn;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }


           
        
        
    }
    public static void main(String[] args) {
        int a[]={1,5,4,3,2};
        sort(a);
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");

        
    }
}