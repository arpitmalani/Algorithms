package com.neha.gs.other;

import java.util.Arrays;
import java.util.Comparator;

//1) First sort jobs according to finish time.
//2) Now apply following recursive process. 
//   // Here arr[] is array of n jobs
//   findMaximumProfit(arr[], n)
//   {
//     a) if (n == 1) return arr[0];
//     b) Return the maximum of following two profits.
//         (i) Maximum profit by excluding current job, i.e., 
//             findMaximumProfit(arr, n-1)
//         (ii) Maximum profit by including the current job            
//   }
//
//How to find the profit including current job?
//The idea is to find the latest job before the current job (in 
//sorted array) that doesn't conflict with current job 'arr[n-1]'. 
//Once we find such a job, we recur for all jobs till that job and
//add profit of current job to result.
//In the above example, "job 1" is the latest non-conflicting
//for "job 4" and "job 2" is the latest non-conflicting for "job 3".
 

public class WeightedJobScheduling {
	
	public static void main(String[] args) {
		Job[] jobs = {new Job(1,2,50), new Job(2,100,200), new Job(6,19,100), new Job(3,10,20)};
		Arrays.sort(jobs, new JobComparator());
		System.out.println(findMaxProfit(jobs, jobs.length));
	}
	
	public static int latestNonConflict(Job[] jobs, int index){
		for(int j=index-1; j>=0;j--){
			if(jobs[j].end<=jobs[index].start){
				return j;
			}
		}
		return -1;
	}
	
	public static int findMaxProfit(Job[] arr, int n){
		int[] temp = new int[n];
		temp[0]=arr[0].profit;
		for(int j=1;j<n;j++){
			int inclProfit= arr[j].profit;
			int preLatest=latestNonConflict(arr, j);
			if(preLatest!=-1){
				inclProfit+=temp[preLatest];
			}
			temp[j]=Math.max(inclProfit, temp[j-1]);
		}
		return temp[n-1];
	}

}

class JobComparator implements Comparator<Job>{
	public int compare(Job j1, Job j2){
		if(j1.end == j2.end){
			return 0;
		}
		
		if(j1.end<j2.end){
			return -1;
		}else{
			return 1;
		}
	}
}


class Job{
	int start;
	int end;
	int profit;
	
	public Job(int start, int end, int profit){
		this.start=start;
		this.end=end;
		this.profit=profit;
	}
	
	public String toString(){
		return "Start: " + start + "ENd: " + end + "Profit: " + profit;
	}
}