class Solution {
    public String intToRoman(int num)
     {
        StringBuilder str = new StringBuilder();

        while(num!=0)
        {
            if(num>=1000)
            {
                str.append('M');
                num-=1000;
            }
            else if(num>=500)
            {
                if(num>=900 && num<=999)
                {
                    str.append("CM");
                    num-=900;
                }
                else
                { 
                  str.append('D');
                  num-=500;
                }
            }
            else if(num>=100)
            {
                if(num>=400 && num<=499)
                {
                    str.append("CD");
                    num-=400;
                }
                else
                {
                   str.append('C');
                   num-=100;
                }
            }
            else if(num>=50)
            {
                 if(num>=90 && num<=99)
                {
                    str.append("XC");
                    num-=90;
                }
                else 
                {
                  str.append('L');
                  num-=50;
                }              
            }
            else if(num>=10)
            {
                 if(num>=40 && num<=49)
                {
                    str.append("XL");
                    num-=40;
                }
                else
                {
                   str.append('X');
                   num-=10;
                }
            }
            else if(num>=5)
            {
                 if(num==9)
                {
                    str.append("IX");
                    num-=9;
                }
                else 
                {
                  str.append('V');
                  num-=5; 
                }
            }
            else
            {
                 if(num==4)
                {
                    str.append("IV");
                    num-=4;
                }
                else 
                {
                  str.append('I');
                  num-=1;
                } 
            }
        
        }
        
        return str.toString();


        
    }
}