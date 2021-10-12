class NameValidate
{
    static boolean valid(String str)
    {   char ch1,ch2,ch3;
        boolean tst=true;
        int len=str.length();
        // TO CHECK FOR ALPHABAT AND SPACE
        for(int x=0;x<len;x++)
        {
            ch1=str.charAt(x);
            if(ch1>=65 && ch1<=90){}
            else if(ch1>=97 && ch1<=122){}
            else if(ch1==32){}
            else{tst=false;} 
        }
        //TO CHECK FOR CONSICATIVE REPEATED ALPHABAT
        int tlen=len==3?1:len-3;
        for(int x=0;x<tlen;x++)
        {
            ch1=str.charAt(x);
            ch2=str.charAt(x+1);
            ch3=str.charAt(x+2);
            if(ch1==ch2 &&ch1==ch3)
            tst=false;
        }
        if(len<3)
        {
            tst=false;
        }
        return tst;
    }
}        