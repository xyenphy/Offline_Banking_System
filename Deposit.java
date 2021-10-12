import java.io.*;
class Deposit
{
    public static void aDeposit()throws IOException
    {
        double amt;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("\f\n\t\t\t\t....WELCOME TO HDFC BANK...");
        System.out.println("\t\t\t   ....Kandivli - E. THAKUR COMPLEX Branch...");
        System.out.println("\n");
        for(int x=0;x<=14;x++)
            System.out.print("=====");
        System.out.println("\n\n\n");
        System.out.print("\t\t\t\t");
        System.out.print("----Deposit----"); 
        System.out.print("\n");
        System.out.print("Enter Account Number: ");
        String str=br.readLine();
        FileReader fr2 = new FileReader("Acc_tr.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        FileWriter fr3 = new FileWriter("tmp.txt",true);
        BufferedWriter br3 = new BufferedWriter(fr3);
        PrintWriter pr = new PrintWriter(br3);

        String str1,str2;
        while(true)
        {
            str1=br2.readLine();
            if(str1==null)
            {
                break;
            }
            str2=br2.readLine();
            if(str.equalsIgnoreCase(str1))
            {
                System.out.println("Account Number Found");
                System.out.println("Enter The Amount to Deposit: ");
                amt=Double.parseDouble(br.readLine());
                str2=""+(Double.parseDouble(str2)+amt);
                System.out.println("Total Balance :"+str2);
            }
            pr.println(str1);
            pr.println(str2);
        }
        fr2.close();
        br2.close();        
        pr.close();
        br3.close();
        fr3.close();
        File f1 = new File("Acc_tr.txt");
        File f2 = new File("tmp.txt");
        f1.delete();
        f2.renameTo(new File("Acc_tr.txt"));
        MENU.main();
    }
}