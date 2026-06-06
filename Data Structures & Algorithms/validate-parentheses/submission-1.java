class Solution {
    public boolean isValid(String s) {
        char a[]=new char[]{'(', '{','[',')', '}' , ']'};
        char[] stac=new char[1000];;
        int top=-1;

        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)==a[0] || s.charAt(i)==a[1] || s.charAt(i)==a[2]){
                top++;
                stac[top]=s.charAt(i);
            }
            else    // s="(])" top == -1       ( top 0, ]
            {
                if(top == -1) return false;
                else if (s.charAt(i)==a[3])
                        { if (stac[top]==a[0]) 
                        top--;
                        else return false;
                        }
                else if (s.charAt(i)==a[4])
                        { 
                        if (stac[top]==a[1]) 
                        top--;
                        else return false;
                        }                
                else if (s.charAt(i)==a[5])
                        { if (stac[top]==a[2]) 
                        top--;
                        else return false;
                        }
                else return false;
            }
        }
        if (top==-1) return true;
        else return false;
    }
} 
