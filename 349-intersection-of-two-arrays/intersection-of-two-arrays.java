class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();

        for(int num: nums1){
            set.add(num);
        }
        int temp[]=new int[Math.min(nums1.length,nums2.length)];
        int index=0;

        for(int num:nums2){
            if(set.contains(num)){
                temp[index++]=num;
                set.remove(num);
            }
        }
        int []result=new int[index];
        System.arraycopy(temp,0,result,0,index);

        return result;
    }
}