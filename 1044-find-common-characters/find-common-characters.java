class Solution {
    public List<String> commonChars(String[] words) {

        Map<Character,Integer>map=new HashMap<>();

        for(char ch:words[0].toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=1;i<words.length;i++){
            Map<Character,Integer>temp=new HashMap<>();
            for(char ch:words[i].toCharArray()){
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }
            for(char c :map.keySet()){
                map.put(c,Math.min(map.get(c),temp.getOrDefault(c,0)));
            }
           
            
        }
         List<String>ans=new ArrayList<>();
            for(char c:map.keySet()){
                for(int i=0;i<map.get(c);i++){
                    ans.add(String.valueOf(c));
                }


            }
            return ans;


        
    }
}