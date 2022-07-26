package fetch;
import java.util.Random;
import java.util.*;
public class AvgClass {

	public static void main(String[] args) {
		
		       Scanner sc=new Scanner(System.in);
				Random random = new Random();
				
				int score[]={0,1,2,3,4,6};
				int count[]=new int[7];
				int index;
				double sr,totalrun=0;
				
				for (int k = 0; k < 5; k++) {
				for(int i=0;i<30;i++)
				{
					index=sc.nextInt(6);
					totalrun+=score[index];
					count[score[index]]++;
				}}
				
				sr=totalrun/30;
				double sr_rate=sr*100;
				
				double score_5=0.0;
				score_5=score_5+sr;
				System.out.println("total run scored:    "    +totalrun);
				System.out.println("Avg run scored:    "    +score_5/5);
				
				for(int i=0;i<6;i++)
					System.out.println("Number of "+score[i]+" is : "+count[score[i]] );
				
				
				System.out.println("Strike Rate (runs per ball):\r\n" + 
						" "+sr);
				
				System.out.println("Average Sstrike rate :"+sr_rate/5);
	}

}
