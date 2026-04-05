class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> s1=new Stack<>();

        for(char c : s.toCharArray()){
            if(c=='('){
                s1.push(c);
            }else{
                if(!s1.isEmpty()&&s1.peek()=='('){
                    s1.pop();
                }
                else{
                    s1.push(c);
                }
            }
        }
        return s1.size();


        
    }
}