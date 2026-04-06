class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> s1=new Stack <>();
        Set<Integer> set=new HashSet<>();
        int n=s.length();

        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                s1.push(i);
            }
            else if(c==')'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
                else{
                    set.add(i);
                }
            }
        }
        while(!s1.isEmpty()){
            set.add(s1.pop());
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

        
    }
}