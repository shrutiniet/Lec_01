package Lecture01;
import java.util.*;

public class Extra {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
					arr[i]=sc.nextInt();
				int a=0;
				int b=0;
				int c=0;
				for(int i=0;i<n;i++)
				{
					if(arr[i]==0)
						a++;
					else if(arr[i]==1)
						b++;
					else
						c++;
				}
				for(int i=0;i<a;i++)
					arr[i]=0;
				for(int i=a;i<=(n-b);i++)
					arr[i]=1;
				for(int i=(n-c);i<n;i++)
					arr[i]=2;
				for(int i=0;i<n;i++)
					System.out.println(arr[i]);
				
				
	}

}
