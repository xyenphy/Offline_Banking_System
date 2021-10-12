import java.util.Date;
import java.text.ParseException;
import java.text.DateFormat;
class ChkDate
{
    static boolean ADate(String d,String m,String y)
    {
        boolean chk=true;
        String dt = m+"/"+d+"/"+y;  //Invalid Date
        //String dt = "02/29/2004";  //Valid Date
        try
        {
            DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
            df.setLenient(false);  // this is important!
            Date dt2 = df.parse(dt);
            //System.out.println("Date is ok = " + dt2);
        }
        catch (ParseException e)
        {
            chk=false;
        }
        catch (IllegalArgumentException e)
        {
            chk=false;
        }
        return chk;
    }
}