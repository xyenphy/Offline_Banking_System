import java.io.*;
class NewAccount
{
    public static void NAccount()throws IOException
    {
        String A_Name, A_Add, A_Mob, A_DOB_DD, A_DOB_MM, A_DOB_YY;
        boolean tst=true;
        char ch;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("\f\n\t\t\t....WELCOME TO HDFC BANK...");
        System.out.println("\t\t   ....Kandivli - E. THAKUR COMPLEX Branch...");
        System.out.println("\n");
        for(int x=0;x<=14;x++)
            System.out.print("=====");
        System.out.println("\n\n\n");
        System.out.print("\t\t\t");
        System.out.print("----New Account Window----");        
        do
        {
            System.out.print("\n\t\t");
            System.out.print("Name of the Account Holder: ");
            A_Name=br.readLine();
        }while(!NameValidate.valid(A_Name));
        do
        {
            System.out.print("\n\t\t");
            System.out.print("Address of the Account Holder: ");
            A_Add=br.readLine();
        }while(A_Add.length()<5);
        do
        {
            System.out.print("\n\t\t");        
            System.out.print("Date of Birth DD/MM/YYYY: ");
            System.out.print("\n\t\t");        
            System.out.print("Enter Date \"DD\" : ");
            A_DOB_DD=br.readLine();
            System.out.print("\t\t");        
            System.out.print("Enter Month \"MM\" : ");
            A_DOB_MM=br.readLine();
            System.out.print("\t\t");        
            System.out.print("Enter Year \"YYYY\" : ");
            A_DOB_YY=br.readLine();
        }while(!ChkDate.ADate(A_DOB_DD,A_DOB_MM,A_DOB_YY));
        System.out.print("\n\t\t");
        do
        {
            System.out.print("Contact Detail: ");
            A_Mob=br.readLine();
        }while(!PNo.p_valid(A_Mob)); 

        System.out.print("\n\t\tProcessing your Data");
        for(int a=1;a<=10;a++)
        {
            for(double b=1;b<=100000;b+=.0004);
            System.out.print(". ");
        }
        add(A_Name, A_Add, A_Mob, A_DOB_DD, A_DOB_MM, A_DOB_YY);
    }

    static void add(String A_Name, String A_Add, String A_Mob, String A_DOB_DD, String A_DOB_MM, String A_DOB_YY)throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);        
        FileWriter fr = new FileWriter("Acc_H_Detail.txt",true);
        BufferedWriter br2 = new BufferedWriter(fr);
        PrintWriter pr = new PrintWriter(br2);
        int ano=AccNo.account();
        String acono="1900020"+(ano+1);
        System.out.println("Your Account Number:- "+acono);
        br.readLine();
        pr.println(acono);
        pr.println(A_Name);
        pr.println(A_Add);
        pr.println(A_Mob);
        pr.println(A_DOB_DD+"-"+A_DOB_MM+"-"+A_DOB_YY);
        pr.close();
        br2.close();
        fr.close();
        Obal(acono);
        MENU.main();
    }

    static void Obal(String acno)throws IOException
    {
        FileWriter fr = new FileWriter("Acc_tr.txt",true);
        BufferedWriter br2 = new BufferedWriter(fr);
        PrintWriter pr = new PrintWriter(br2);
        pr.println(acno);
        pr.println("1000");
        pr.close();
        br2.close();
        fr.close();
    }
}