import javax.sql.rowset.spi.SyncResolver;

public class one {
    public static void main(String[], args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=0,j=0;
   int arr[]=new int[n];
   for(i=0;i<n;i++)
     arr[i]=sc.nextInt();
     for(i=0;i<n;i++)
     {
         for(j=i+1;j<n;j++)
        { if(arr[i]>arr[j])
         {
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }
        }
     }
     for(i=0;i<n;i++)
     System.out.print(arr[i]+" ");
}
}
