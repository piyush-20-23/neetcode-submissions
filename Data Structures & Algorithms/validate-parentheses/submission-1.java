class Solution {
    public boolean isValid(String s) {
        int l=s.length();

        Stack<Character>c=new Stack<>();
        
        for(int i=0;i<l;i++){
            if(c.size()>0){
            
            if(c.peek()=='(' && s.charAt(i)==')'){
                c.pop();
            }
            else if(c.peek()=='{' && s.charAt(i)=='}'){
                c.pop();
            }
            else if(c.peek()=='[' && s.charAt(i)==']'){
                c.pop();
            }
            else{
                c.push(s.charAt(i));
            }
        }
            
            else{
                c.push(s.charAt(i));
            }
        }

        return c.size()==0;
    }
}
