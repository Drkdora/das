import java.util.*;

public class string60
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		boolean ans = false;
		for(int i =0; i<str1.length();i++)
		{
		    String str = "";
    		for(int j =i; j<str1.length();j++)
		    {
		        str = str + ( ""+str1.charAt(j));
		    }
		    for(int k =0; k<i;k++)
		    {
		        str = str + ( ""+str1.charAt(k));
		    }
		    if(str.equals(str2))
		    {
		        ans = true;
		        break;
		    }
		}
		
		if(ans == true)
		{
		    System.out.println("Yes it is a rotation of the original");
		}
		else
		{
	    	System.out.println("Nope!! it is a NOT rotation of the original");
		}
	}
}
