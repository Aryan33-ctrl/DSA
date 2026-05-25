class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // with optimal two pointers approach 


        int result[]=new int[m+n];
        int index=0;
        int i=0;
        int j=0;

        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                result[index]=nums1[i];
                i++;
                
            }else{
                result[index]=nums2[j];
                j++;
                
            }
            index++;
        }
        while(i<m){
            result[index]=nums1[i];
            i++;
            index++;
        }
        while(j<n){
            result[index]=nums2[j];
            j++;
            index++;
        }


        for(int k=0;k<m+n;k++){
            nums1[k]=result[k];
        }

    

        

        
    }
}