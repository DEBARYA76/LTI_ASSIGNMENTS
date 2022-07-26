package develop;
import java.util.*;
import java.io.*;
public class InnigsStat {

	public static void main(String[] args) {
		
		
		

		
				Random sc = new Random();
				//int runs[]=new int[30];
				int score[]={0,1,2,3,4,6};
				int count[]=new int[7];
				int index;
				double sr,totalrun=0;
				for(int i=0;i<30;i++)
				{
					index=sc.nextInt(6);
					totalrun+=score[index];
					count[score[index]]++;
				}
				sr=totalrun/30;
				System.out.println("total run scored:    "    +totalrun);
				for(int i=0;i<6;i++)
					System.out.println("Number of "+score[i]+" is : "+count[score[i]] );
				System.out.println("Strike Rate (runs per ball):\r\n" + 
						" "+sr);
			}
	}


