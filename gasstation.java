public class gasstation {
    public static void main(String[] args) {
           int s=0,c=0;

        int arr1[]={1,2,3,4,5};
        int arr2[]={3,4,5,1,2};
       for(int i=0;i<arr2.length;i++)
        {     s=s+arr1[i]-arr2[i];
                
              
        }
        if(s<0)
         System.out.println("-1");
        else 
        {
            for(int k=0;k<arr1.length;k++)
            {
                if(arr1[k]-arr2[k]>0)
                {c=k;
                 break;}
            }
            System.out.println(c);
        }
            int k=11^11;
            System.out.println(k);
        //  if(arr1[b]>arr2[b])
        //     System.out.println(b);
        //       else
        //     System.out.println("-1");
        
    }
}
