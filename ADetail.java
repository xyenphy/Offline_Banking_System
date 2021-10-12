import java.io.*;
class ADetail
{
    public static void dAccount()throws IOException
    {
        String ano;
        int ch;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("\f\n\t\t\t\t....WELCOME TO HDFC BANK...");
        System.out.println("\t\t\t   ....Kandivli - E. THAKUR COMPLEX Branch...");
        System.out.println("\n");
        for(int x=0;x<=14;x++)
            System.out.print("=====");
        System.out.println("\n\n\n");
        System.out.print("\t\t\t\t");
        System.out.print("----Acount Detail----"); 
        do
        {
            try
            {                
                System.out.print("\n\n\t\t\t\t1. Display Perticular Account Detail");
                System.out.print("\n\n\t\t\t\t2. Display All Account Detail");
                System.out.print("\n\n\t\t\t\t3. Exit");
                ch = Integer.parseInt(br.readLine());
                if(ch>=1 && ch<=3)
                    break;
            }
            catch(Exception e)
            {
                dAccount();
            }
        }while(true);
        System.out.println("\n");
        for(int x=1;x<=20;x++)
            System.out.print("==");
        System.out.print("\n");
        switch(ch)
        {
            case 1:
            System.out.print("Enter Your Account No. ");
            ano=br.readLine();
            display(ano);
            break;
            case 2:
            displayall();
            break;
            case 3:
            MENU.main();
            break;
        }
        br.readLine();
        MENU.main();
    }

    static void display(String acno)throws IOException
    {
        String info[]=new String[5];
        FileReader fr = new FileReader("Acc_H_Detail.txt");
        BufferedReader br2 = new BufferedReader(fr);
        String str0,str;
        int n=0,ch;
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
                balance(str0);
                break;
            }
        }
        if(n==0)
            System.out.println("Record Not Found");
        br2.close();
        fr.close();
    }

    static void displayall()throws IOException
    {
        String info[]=new String[5];
        FileReader fr1 = new FileReader("Acc_H_Detail.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        String str0,str,str1;
        int n=1,ch;
        while(true)
        {
            str0=br1.readLine();
            if(str0==null)
            {
                break;
            }
            System.out.print((n++)+". ");
            System.out.println("Account No: "+str0);
            str=br1.readLine();
            System.out.println("   Name: "+str);
            str=br1.readLine();
            System.out.println("   Address: "+str);
            str=br1.readLine();
            System.out.println("   Tell No: "+str);                
            str=br1.readLine();
            System.out.println("   DOB: "+str);
            balance(str0);
            System.out.println("\n");
            for(int x=1;x<=20;x++)
                System.out.print("--");
            System.out.println("\n");
        }
        fr1.close();
        br1.close();
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
}