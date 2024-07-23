import java.util.Scanner;
class Bank
{
    int balance=0;
    long acno;
    String name;

    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Number");
        acno=sc.nextLong();
        System.out.println("Enter Name Of Your Account");
        name=sc.next();
    }

    void deposite()
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Amount Which You Want To Deposite");
        a=sc.nextInt();
        if(a<0)
        {
            System.out.println("Please Enter Postitive Amount");
        }
        else if(a<100)
        {
            System.out.println("Atleast you Have To Deposite 100 Rupees");
        }
        else
        {
            balance=balance+a;
        }
    }

    void withdraw()
    {
        if(balance==0)
        {
            System.out.println("You Have Zero Balance in Your Account");
        }
        else if(balance<=1000)
        {
            System.out.println("You can't Withdraw Money At This Time");
        }
        else
        {
            int b;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Amount Which You Want To Withdraw");
            b=sc.nextInt();
            if(b<0)
            {
                System.out.println("Enter Only Positive Account");
            }
            else if(b<100)
            {
                System.out.println("You Have To Withdraw Atleast 100 INR");
            }
            else
            {
                balance=balance-b;
            }
        }
    }

    void display()
    {
        System.out.println("Your Account name is             "+name);
        System.out.println("Your Account Number is           "+acno);
        System.out.println("Your Current Account balance  is "+balance);
    }

    void checkbalance()
    {
        System.out.println("Your Current Balance Is "+balance);
    }
}
public class BankMain
{
    public static void main(String [] args)
    {
        Bank b4[]=new Bank[5];
        int b=0,i,d=0,j=0,index=0;
        long accno,cd;
        String username,password,s1="admin";

        while(true)
        {
            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("3.Exit");

            Scanner sc=new Scanner(System.in);
            System.out.println(" Enter Your Choice");
            b=sc.nextInt();

            switch(b)
            {
                case 1:
                    Scanner st=new Scanner(System.in);
                    System.out.println("Enter UserName And Password");
                    username=st.nextLine();
                    password=st.nextLine();
                    do
                    {
                        if(s1.equals(username) && s1.equals(password))
                        {
                            System.out.println("This Is the Sub-Menu of Admin");
                            System.out.println("1.Create User");
                            System.out.println("2.Display");
                            System.out.println("3.Logout");
                            System.out.println("4.Exit");

                            System.out.println("Enter Your Choice");
                            b=sc.nextInt();

                            switch(b)
                            {
                                case 1:
                                    b4[j]=new Bank();
                                    b4[j].getdata();
                                    j++;
                                    break;
                                case 2:
                                    for(i=0;i<j;i++)
                                    {
                                        b4[i].display();
                                    }
                                    break;
                                case 3:
                                    System.out.println("You Have Successfully Logged Out");
                                    break;
                                case 4:
                                    System.exit(0);
                                    System.out.println("You Have Been Back In Command Prompt");
                                default:
                                    System.out.println("Enter Valid Choice");
                            }
                        }
                        else
                        {
                            System.out.println("User Name And Password Are Not Same");
                            break;
                        }
                    }
                    while(b!=3);
                    break;

                case 2:
                    Scanner s=new Scanner(System.in);
                    System.out.println("Enter Account Number");
                    cd=s.nextLong();

                    int f=0,e=0,c=0;

                    for(i=0;i<j;i++)
                    {
                        if(b4[i].acno==cd)
                        {
                            e=1;
                            index=i;
                            break;
                        }
                    }
                    if(e==0)
                    {
                        System.out.println("User Not Found");
                    }
                    else
                    {
                        while(b!=6)
                        {
                            System.out.println("1.Withdraw");
                            System.out.println("2.Deposite");
                            System.out.println("3.Check balance");
                            System.out.println("4.Transfer Amount");
                            System.out.println("5.Display");
                            System.out.println("6.LogOut");
                            System.out.println("7.Exit");

                            System.out.println("Enter Your Choice");
                            b=sc.nextInt();

                            switch(b)
                            {
                                case 1:
                                    b4[index].withdraw();
                                    break;

                                case 2:
                                    b4[index].deposite();
                                    break;

                                case 3:
                                    b4[index].checkbalance();
                                    break;

                                case 4:
                                    System.out.println("Enter The Account number in Which you Want To Transfer Amount");
                                    accno=sc.nextLong();

                                    for(i=0;i<j;i++)
                                    {
                                        if(accno==b4[i].acno)
                                        {
                                            f=1;
                                            c=i;
                                            break;
                                        }
                                    }
                                    if(f==0)
                                    {
                                        System.out.println("User Not Found");
                                    }
                                    else
                                    {
                                        int l=0;
                                        if(index==c)
                                        {
                                            System.out.println("You Can't Transfer Amount in Your Acoount ");
                                            l=1;
                                        }

                                        if(l==0)
                                        {
                                            int amount;
                                            System.out.println("Enter The Amount");
                                            amount=sc.nextInt();

                                            int difference;
                                            difference=b4[index].balance-amount;
                                            if(amount>b4[index].balance)
                                            {
                                                System.out.println("Sorry");
                                            }
                                            else if(b4[index].balance==0)
                                            {
                                                System.out.println("Your Balance is zero");
                                            }
                                            else if(difference<1000)
                                            {
                                                System.out.println("Your Balance is less than 1000");
                                            }
                                            else if(amount<0)
                                            {
                                                System.out.println("Your Enter Positive Amount");
                                            }
                                            else
                                            {
                                                b4[index].balance=b4[index].balance-amount;
                                                b4[c].balance=b4[c].balance+amount;
                                                System.out.println("Money Successfully Transfered");
                                            }
                                        }
                                    }
                                    break;

                                case 5:
                                    b4[index].display();
                                    break;

                                case 6:
                                    System.out.println("You Have Been Successfully Logged Out");
                                    break;
                                case 7:
                                    System.exit(0);

                                default:
                                    System.out.println("Enter Valid Choice");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("You Have Been Back in Command Prompt");
                    System.exit(0);
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
    }
}