class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n =nums1.length+nums2.length;
         int[] merge=new int[n];
         for(int i=0;i<nums1.length;i++)
         {
            merge[i]=nums1[i];
         }
          for(int i=0;i<nums2.length;i++)
         {
            merge[nums1.length+i]=nums2[i];
            
         }
         Arrays.sort(merge);
        
         double median;
         if(n%2==1){
         median=merge[n/2];
         }else{
            median=(merge[n/2-1]+merge[n/2])/2.0;
         }
         return median;
    }
}