
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextLong();
		}

		sc.close();
		
		long max = Long.MIN_VALUE;
		long cs=0;

		boolean pass = false;
		for(long num:arr){
			if(num>0)
				pass = true;
		}

		if(pass){
			for(long num: arr){
				cs = cs+num;
				if(cs < 0)
					cs = 0;
				max = max<cs?cs:max;
			}
			System.out.println(max);
		}
		else{
			max = Long.MIN_VALUE;
			for(long num: arr){
				max = max<num?num:max;
			}
			System.out.println(max);
		}
	}
}
