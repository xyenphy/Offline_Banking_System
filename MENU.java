import java.io.*;

class MENU
{
    public static void main()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int ch=0;
        do
        {
        System.out.println("\f\n\t\t\t....WELCOME TO HDFC BANK...");
        System.out.println("\t\t   ....Kandivli - E. THAKUR COMPLEX Branch...");
        for(int x=0;x<=14;x++)
            System.out.print("=====");
        System.out.println("\n");
        System.out.print("\t\t\t");
        System.out.println("----Please Select The Choice----");
        System.out.println("\n\t\t\t   ===>1. Create New Account.");
        System.out.println("\n\t\t\t   ===>2. Deposit.");
        System.out.println("\n\t\t\t   ===>3. Withdraw.");
        System.out.println("\n\t\t\t   ===>4. Display Account Detail.");
        System.out.println("\n\t\t\t   ===>5. Delete Account.");
        System.out.println("\n\t\t\t   ===>6. Exit.");
        System.out.print("Enter your Choice: ");
        try
        {
            ch=Integer.parseInt(br.readLine());
        }
        catch(Exception e)
        {
            main();
        }
        if(ch>=1 && ch<=7)
        break;
    }while(true);
        switch(ch)
        {
            case 1:
            NewAccount na = new NewAccount();
            na.NAccount();
            break;
            case 2:
            Deposit dep = new Deposit();
            dep.aDeposit();
            break;
            case 3:
            Withdraw wd=new Withdraw();
            wd.wdAccount();
            break;
            case 4:
            ADetail ad = new ADetail();
            ad.dAccount();
            break;
            case 5:
            Delete del=new Delete();
            del.delAccount();
            break;
            case 6:
            System.out.println("----Exit.----");
            break;
            default:
            System.out.println("Invalid Choice!");
            main();
        }
        for(double a=0;a<=1000000;a+=0.005);

    }
}