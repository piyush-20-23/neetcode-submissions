class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> s = new ArrayDeque<>();

        for(String str : tokens){
            if(str.equals("+")){
                s.push(
                    s.poll() + s.poll()
                );
            }
            else if(str.equals("-")){
                int a = s.poll();
                int b = s.poll();
                s.push(
                    b - a
                );
            }
            else if(str.equals("*")){
                s.push(
                    s.poll() * s.poll()
                );
            }
            else if(str.equals("/")){
                int a = s.poll();
                int b = s.poll();
                s.push(
                    b / a
                );
            }
            else{
                // if it is not a operation then it is a number
                int num = Integer.parseInt(str);
                s.push(num);

            }
//System.out.println(s);
        }

        return s.peek();
    }
}
