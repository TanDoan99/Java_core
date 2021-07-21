package fa.training.assignment3;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int lowerbound=1,upperbound=100,sum=0;
		for(int i=lowerbound;i<=upperbound;i++){
			sum+=i;
		}
		System.out.println("Average of all 100 first numbers: " + sum/100);
	}
}
