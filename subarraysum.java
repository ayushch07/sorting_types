class subarraysum{
    public static void main(String[] args) {
         int arr[]={-2,-5,-6,-5,7};
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
            {  int sum=0;
                for(int j=i;j<arr.length;j++)
                {
                     sum=sum+arr[j];
                      ans=Math.max(sum, ans);
                }

            }
            System.out.println(ans);
        
    }
}