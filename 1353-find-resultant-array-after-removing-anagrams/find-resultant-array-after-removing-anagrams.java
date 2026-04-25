class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String>res=new ArrayList<>();

        for(String word:words){
            if(res.isEmpty()){
                res.add(word);
            }else{
                String prev= res.get(res.size()-1);
                if(!isAnagram(prev,word)){
                    res.add(word);
                }
            }

        }
        return res;
        
    }
    private boolean isAnagram(String s,String b){
        char[]arr1=s.toCharArray();
        char[]arr2=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}