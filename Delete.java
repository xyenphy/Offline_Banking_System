import java.io.*;
class Delete
{
    public static void delAccount()throws IOException
    {   String ano;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("\f\n\t\t\t\t....WELCOME TO HDFC BANK...");
        System.out.println("\t\t\t   ....Kandivli - E. THAKUR COMPLEX Branch...");
        System.out.println("\n");
        for(int x=0;x<=14;x++)
            System.out.print("=====");
        System.out.println("\n\n\n");
        System.out.print("\t\t\t\t");
        System.out.print("----Delete Account----"); 
        System.out.println("\n");
        for(int x=1;x<=20;x++)
            System.out.print("==");
        System.out.print("\n");
        System.out.print("Enter Your Account No. ");
        ano=br.readLine();
        display(ano);
    }

    static void display(String acno)throws IOException
    {
        String info[]=new String[5];
        FileReader fr = new FileReader("Acc_H_Detail.txt");
        BufferedReader br2 = new BufferedReader(fr);

        String str0,str;
        int n=0,ch,con;
        while(true)
        {
            str0=br2.readLine();
            if(str0==null)
            {
                break;
            }
            if(str0.equalsIgnoreCase(acno))
            {
                n=1;
                str=br2.readLine();
                System.out.println("Name: "+str);
                str=br2.readLine();
                System.out.println("Address: "+str);
                str=br2.readLine();
                System.out.println("Tell No: "+str);                
                str=br2.readLine();
                System.out.println("DOB: "+str);
                br2.close();
                fr.close();
                balance(str0);
                del(str0);
                break;
            }
        }        
        if(n==0)
            System.out.println("Record Not Found");
           for(double x=0;x<100000;x+=0.0001);
            MENU.main();
    }

    static void balance(String ano)throws IOException
    {
        FileReader fr2 = new FileReader("Acc_tr.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        String str1;
        while(true)
        {
            str1=br2.readLine();
            if(str1==null)
            {
                break;
            }
            if(ano.equalsIgnoreCase(str1))
            {
                str1=br2.readLine();
                System.out.println("   Balance: "+str1);
            }
        }
        fr2.close();
        br2.close();
    }

    static void del(String DAcc)throws IOException
    {
        FileReader fr1 = new FileReader("Acc_H_Detail.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        FileReader fr2 = new FileReader("Acc_tr.txt");
        BufferedReader br2 = new BufferedReader(fr2);

        FileWriter fr3 = new FileWriter("tmp1.txt");
        BufferedWriter br3 = new BufferedWriter(fr3);
        PrintWriter p1=new PrintWriter(br3);

        FileWriter fr4 = new FileWriter("tmp2.txt");
        BufferedWriter br4 = new BufferedWriter(fr4);
        PrintWriter p2=new PrintWriter(br4);

        String str;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int con;
        do
        {
            try
            {
                for(int x=1;x<=20;x++)
                    System.out.print("==");
                System.out.print("\n");
                System.out.println("Account Detail Found..");
                System.out.println("Delete Account Y(1) / N(2) ");
                con=Integer.parseInt(br.readLine());
                if(con>=1 && con<=2)
                {
                    break;
                }
            }
            catch(Exception e)
            {
                del(DAcc);
            }
        }while(true);
        if(con==1)
        {
            while(true)
            {
                str=br1.readLine();
                if(str==null)
                    break;
                if(str.equalsIgnoreCase(DAcc))
                {
                    str=br1.readLine();
                    str=br1.readLine();
                    str=br1.readLine();
                    str=br1.readLine();
                }
                else
                {
                    p1.println(str);
                    str=br1.readLine();
                    p1.println(str);
                    str=br1.readLine();
                    p1.println(str);
                    str=br1.readLine();
                    p1.println(str); 
                    str=br1.readLine();
                    p1.println(str);
                }
            }
            while(true)
            {
                str=br2.readLine();
                if(str==null)
                    break;
                if(str.equalsIgnoreCase(DAcc))
                {
                    str=br2.readLine();
                }
                else
                {
                    p2.println(str);
                    str=br2.readLine();
                    p2.println(str);
                }
            }
            p1.close();
            p2.close();
            br1.close();
            br2.close();
            br3.close();
            br4.close();
            fr1.close();
            fr2.close();
            fr3.close();
            fr4.close();
            File f1 = new File("Acc_tr.txt");
            File f2 = new File("tmp2.txt");
            File f3 = new File("Acc_H_Detail.txt");
            File f4 = new File("tmp1.txt");

            f1.delete();
            f3.delete();
            f2.renameTo(new File("Acc_tr.txt"));
            f4.renameTo(new File("Acc_H_Detail.txt"));

        }
    }
}