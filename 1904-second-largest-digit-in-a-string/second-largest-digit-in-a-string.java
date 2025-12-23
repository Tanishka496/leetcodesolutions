class Solution {
    public int secondHighest(String s)
     {
        char ch;
        int digit;
        int largest=-1;
        int slargest=-1;
        for(int i=0;i<s.length();i++)
        {
              ch = s.charAt(i);
              if(ch>='0'&& ch<='9')
              {
                 digit=ch-'0';
                 if(digit>largest)
                 {
                    slargest=largest;
                    largest=digit;
                 }
                 else if(digit<largest && digit>slargest)
                       slargest=digit;
              }
                      
        }
        return slargest;
        
    }
}