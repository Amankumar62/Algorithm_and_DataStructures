package codechef;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		{
			Scanner in=new Scanner(System.in);
			double widrawbal=in.nextDouble();
			double bal=in.nextDouble();
			if(widrawbal%5!=0)
			{
			System.out.println(bal);
			}
			else
			{
			if((widrawbal+0.5)>=bal)
			{

			System.out.println(bal);
			}
			else
			{
			double availbal=bal-(widrawbal+0.5);
			System.out.println(availbal);
			}
			}

	}

	}
}
