public class selectionsort {
    public static void main(String[] args) {
        int arr[]={1,10,7,8};
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int k=0;k<arr.length;k++)
        System.err.print(arr[k]+" ");


        
    }
}
