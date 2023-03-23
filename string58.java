// Print all the duplicates in the input string
// TC : O(n)

import java.util.*;

public class string58
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//storing key-pair value
		int[] arr = new int[256];
		for(char temp : str.toCharArray())
		{
		    int val = arr[temp];
		    arr[temp] = val+1;
		}
		for(int i =0; i<arr.length; i++)
		{
		    int val = arr[i];
		    if(val>1)
		    {
		        System.out.println((char)i+" repeats : "+val);
		    }
		}
		
	}
}
// // TC:: Worst-case : O(n^2), best-case : O(n), avg.TC : O(NlogN)

// import java.util.*;
// import java.util.Map.Entry;

// public class string58
// {
// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 		String str = scan.nextLine();
// 		//storing key-pair value
// 		Map<Character, Integer> mp = new HashMap<>();
// 		for(char temp : str.toCharArray())
// 		{
// 		    if(mp.containsKey(temp))
// 		    {
// 		        int a = mp.get(temp);
// 		        mp.put(temp, a+1);
// 		    }
// 		    else
// 		    {
// 		        mp.put(temp, 1);   
// 		    }
// 		}
// 		//map-iteration
// 		for(Map.Entry<Character, Integer> temp : mp.entrySet())
// 		{
// 		  //  System.out.println(temp.getKey()+" is repeated:: "+temp.getValue());
// 		    if(temp.getValue()>1)
// 		    {
// 		        System.out.println(temp.getKey()+" is repeated:: "+temp.getValue());
// 		    }
// 		}
// 	}
// }

