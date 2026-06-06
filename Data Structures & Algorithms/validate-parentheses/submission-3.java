class Solution {
    public boolean isValid(String s) {
        char a[]=new char[]{'(', '{','[',')', '}' , ']'};
        Stack<Character> stack = new Stack<>();
        int top=-1;

        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)==a[0] || s.charAt(i)==a[1] || s.charAt(i)==a[2]){
               stack.push(s.charAt(i));
            }
            else    // s="(])" top == -1       ( top 0, ]
            {
                if(stack.isEmpty()) return false;
                else if (s.charAt(i)==a[3])
                        { 
                            if (stack.peek()==a[0]) 
                            stack.pop();
                        else return false;
                        }
                else if (s.charAt(i)==a[4])
                        { 
                        if (stack.peek()==a[1]) 
                         stack.pop();
                        else return false;
                        }                
                else
                        { if (stack.peek()==a[2]) 
                         stack.pop();
                        else return false;
                        }
                //else return false;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
} 
