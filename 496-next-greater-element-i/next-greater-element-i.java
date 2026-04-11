class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums1.length;

        Stack<Integer> stack=new Stack<>();

        stack.push(0);

        for(int i=1;i<nums2.length;i++){
            while(true){
                if(stack.isEmpty()){
                    stack.push(i);
                    break;
                }
                int index=stack.peek();

                if(nums2[i]>nums2[index]){
                    map.put(nums2[index],nums2[i]);
                    stack.pop();
                }
                else{
                    stack.push(i);
                    break;
                }
            }
        }
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            if(map.containsKey(nums1[i])){
                result[i]=map.get(nums1[i]);
            }else{
                result[i]=-1;
            }
        }
        return result;
        

        
        
    }
}