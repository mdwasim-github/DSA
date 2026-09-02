class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = updatedString(s);
        String t1 = updatedString(t);
        System.out.println(s1+ t1);
        return s1.equals(t1);
    }
    private String updatedString(String s){
        StringBuilder result = new StringBuilder();
        int c=0;
         for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#')
            {
                c++;
            }
            else{
                if(c>0)
                c--;
                else
                result.append(s.charAt(i));
            }
        }
        return result.reverse().toString();
    }
}