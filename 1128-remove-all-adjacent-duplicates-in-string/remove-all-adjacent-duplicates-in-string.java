class Solution {
    public String removeDuplicates(String s) {

        Stack<Character>stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if(!stack.isEmpty()&&stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);

            }
            

        }

        StringBuilder res=new StringBuilder();
        for(char c :stack){
            res.append(c);
        }
        return res.toString();
        
    }
}