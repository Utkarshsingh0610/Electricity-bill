//exception handling :: electricity bill program

import java.util.Scanner;
class myexcept1 extends Exception
{
    myexcept1(String str)
    {
        super(str);
    }
}
class myexcept2 extends Exception
{
    myexcept2(String str)
    {
        super(str);
    }
}
class elect
{
    public static void main(String[] args)
    {
        try
        {
            double units,tot,tax,fine,totbill,meter;
            long meterno;
        
            Scanner in = new Scanner(System.in);
        
            System.out.print("Enter the units :");
            units = in.nextDouble();
        
            System.out.print("\nEnter the meter number :");
            meterno = in.nextLong();
        
            if(units==0)
            {
                throw new myexcept1("The units cannot be zero"); 
            }
            if(meterno==0)
            {
                throw new myexcept2("The meter number cannot be zero");
            }
        
            if(units<=50)
            {
                tot = units * 0.50;
            }
            else
            {
                if(units >50 && units<=100)
                {
                    tot = units *0.75;
                }
                else
                {
                    if(units>100 && units<=150)
                    {
                        tot = units * 1.20;
                    }
                    else
                    {
                        tot = units *1.50;
                    }
                }
            }
            tax = (tot *(20/100));
            meter = 50;
            if(units>=400)
            {
                fine = 100;
            }
            else{
                fine = 0;
            }
             totbill = tot + fine + tax + meter;
             System.out.print("\nThe total bill of consumer is "+totbill);
        }
        catch(myexcept1 m)
        {
            System.out.print("\n first exception caught\n");
            System.out.print("\n"+m.getMessage());
        }
        catch(myexcept2 u)
        {
            System.out.print("\nSecond exception caught\n");
            System.out.print("\n"+u.getMessage());
        }
    }
}
