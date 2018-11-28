class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length ;
        int len2 = nums2.length ;
        
        if ((len1+len2)%2==1){
            return findKth(nums1,0,nums2,0,(len1+len2)/2+1);
        }else{
            return (findKth(nums1,0,nums2,0,(len1+len2)/2)+findKth(nums1,0,nums2,0,(len1+len2)/2+1))/2 ;
        }
    }
    
    public static double findKth(int[] nums1,int start1, int[] nums2,int start2,int k){
        if(start1 >= nums1.length){
            return nums2[start2+k-1] ;
        }
        
        if(start2 >= nums2.length){
            return nums1[start1+k-1] ;
        }
        
        if (k==1){
            return Math.min(nums1[start1],nums2[start2]);
        }
        
        int median1 = Integer.MAX_VALUE;
        int median2 = Integer.MAX_VALUE ;
        if(start1+k/2 -1<nums1.length){
            median1= nums1[start1+k/2 -1];
        }
        
        if(start2+k/2 -1<nums2.length){
            median2= nums2[start2+k/2 -1];
        }
        
        if (median1>median2){
            return findKth(nums1,start1,nums2,start2+k/2,k-k/2);
        }else{
            return findKth(nums1,start1+k/2,nums2,start2,k-k/2);
        }
        
    }
}