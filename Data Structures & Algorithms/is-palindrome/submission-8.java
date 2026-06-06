class Solution {
    public boolean isPalindrome(String s) {

        if(s == null || s.equals("")){
            return false;
        }
        int n = s.length();
        System.out.println(n);
        for(int i=0,j=n-1;i<=j;){
            System.out.println(i+" "+j);
            if(i==j || i>j) return true;  
            if(Character.isLetterOrDigit(s.charAt(i))){
                if(Character.isLetterOrDigit(s.charAt(j))){
                    if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                        i++;
                        j--;
                   
                    }
                    else return false;                 
                    if(i==j || i>j) return true;     
                }
                else j--;           //tab a cat? 09 08 17 26 33
                }                     //0123456789    
                else i++;  
                if(i==j || i>j) return true; 
                }
                return false;
        }
    }

//Was it a car ot a cat I saw
