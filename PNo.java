public class PNo
{
    static boolean p_valid(String str)
    {
        boolean rtn=true;
        int len=str.length();
        //System.out.println(len);
        if(len!=10)
        rtn=false;
        else
        {
            try
            {
                long tmp=Long.parseLong(str);
            }
            catch(Exception e)
            {
                rtn=false;
            }
        }
        return rtn;
    }
}