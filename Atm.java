import java.util.*;


class  Atm {


public static void main( String args[] ) {




//declaration and initialization of balance, withdraw, and deposit


int balance = 90000;

int withdraw, deposit;



Scanner sc = new Scanner(System.in);


while(true)
{


System.out.println( "Welcome to OUR PUNJAB NATIONAL BANK ATM ... " );

System.out.println( " 1 for Withdraw" );

System.out.println( " 2 for Deposit" );

System.out.println( " 3 for Check Balance" );

System.out.println( " 4 for EXIT" );

System.out.print( "Select the anyone options you want to operate:" );




int dp = sc.nextInt( );


switch( dp )
{


case 1: System.out.print( "Withdrawn amount : " );



// accept the withdrawal amount from the user

withdraw = sc.nextInt();



//checking whether the balance is greater than or equal to the withdrawal amount

withdraw( balance, withdraw);


break;


case 2: 
System.out.print( "deposited Amount: " );



//accept the deposit amount from the user


deposit = sc.nextInt();


// call the function and add the deposit amount to the total balance
deposit( balance, deposit );

break;


case 3:

// printing the total balance of the user


printBalance( balance );

System.out.println(" ");

break;


case 4:



System.exit( 0 );


}

}

}



// function to print the current balance in an account


public static void printBalance(int balance)
{


System.out.println(" Your Current Balance : " + balance);

System.out.println();


}



// function for Withdrawal  of amount and update amount


public static int withdraw(int balance, int withdrawAmount)

{

System.out.println( "Withdrawn Operation :" );

System.out.println("Withdrawing Amount is : " + withdrawAmount);


if (balance >= withdrawAmount) {


balance = balance - withdrawAmount;


System.out.println( "KIndly collect your amount and remove the card" );

printBalance( balance );


}

else {

System.out.println( "Sorry! Your balanace is insufficient." );

System.out.println( );

}

return balance;


}



// The function to deposit an amount and update the balance


public static int deposit(int balance, int depositAmount)
{
System.out.println( "Deposit Operation :" );

System.out.println(" Your depositing amount is : " + depositAmount);

balance = balance + depositAmount;

System.out.println( "Your Money has been successfully deposited" );
printBalance(balance);
return balance;

}


}