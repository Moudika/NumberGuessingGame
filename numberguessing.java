import java.util.*;
class Guess
{
	public void guess()
	{
		
		Scanner sc=new Scanner(System.in);
	    int value = 1 + (int)(100 * Math.random());
		System.out.println("Already Random number is generated.");
		int ch=5;
		System.out.println("Guess the number in 5 trials");
		int s=100,chnc=1;
		for(chnc=1;chnc<=ch;chnc++)
		{
			
			System.out.println("Guess the number Enter it.Chance no"+(chnc));
			int num=sc.nextInt();
			if(num==value)
			{
				System.out.println("Congrats!...You won it");
				System.out.println("Your score is "+s);
				break;
			}
			else if(num>value)
			{
				System.out.println("Number is less than "+num);
				
				s-=20;
			}
			else
			{
				System.out.println("Number is greater than "+num);
				s-=20;
			}
			
		} 
		if(chnc>ch)
		{
		    System.out.println("You Lost it");
			System.out.println("The number is "+value);
			System.out.println("Your score is: 0");
		}
	}
}
class NumberGame
{
    public static void main(String args[])
    {
    	
    	Scanner sc=new Scanner(System.in);
    	Guess f=new Guess();
    	System.out.println("Shall we start it ? : Yes/No");
    	String str=sc.nextLine();
    	while(str.equalsIgnoreCase("Yes")||str.equalsIgnoreCase("y"))
    	{
    		f.guess();
    		System.out.println("Wants to play again ? Yes/No");
    		str=sc.nextLine();
    	}
    	System.out.println("Game Over!");
    }
}