import java.io.*;
class AccNo
{
    static int account()throws IOException
    {
        FileReader fr = new FileReader("Acc_H_Detail.txt");
        BufferedReader br2 = new BufferedReader(fr);
        String str;
        int n=0,ch;
        while(true)
        {
            str=br2.readLine();
            if(str==null)
            {
                break;
            }
            n++;
        }
        br2.close();
        fr.close();
        return n/5;
    }
}