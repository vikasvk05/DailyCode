import java.util.*;
class SubArray{
    // static void subArray(int[] arr,int k){
    //     int n = arr.length;
    //     for(int i=1;i<n;i++){
    //         arr[i] += arr[i-1];
    //         if(arr[i] == k){
    //             System.out.println(1+" "+(i+1));
    //             return;
    //         }
            
    //     }
    //     dis(arr);
        // for(int i=0;i<n;i++){
        //     if(arr[i]>=k){
        //         if(arr[i] == k){
        //             System.out.println(1 +" "+(i+1));
        //             //break;
        //             return;
        //         }
        //         else{
        //             for(int j=0;j<i;j++){
        //                 if((arr[i] - arr[j]) == k){
        //                     System.out.println("inside:"+(j+2)+" "+(i+1));
        //                     return;
        //                 }
        //             }
        //         }
        //     }
        // }
    //}
    // static void subarraySum(int n, int k, int[] arr) {
        
    //     // Your code here
    //     int sum = arr[0],start =0,i;
    //     dis(arr);
    //     for(i=0;i<n;i++){
            
    //         while(sum >k && start <i -1){
    //             sum -= arr[start];
    //             start++;
    //         }
    //         if(sum == k){
    //             System.out.println(start+" "+(i-1));
    //             return;
    //         }
    //         if(i<n)
    //             sum += arr[i];
    //     }
    // }
    public static void subArray(int[] arr, int target) {
		int start = 0, end = 0;
 
		int currSum = 0;
 
		while (start < arr.length && end <= arr.length) {
			if (currSum == target) {
                System.out.println((start+1) + " "+ (int)end);
 
				if (end <= arr.length - 1) {
					currSum += arr[end];
				}
				end++;
			}
            else {
				if (currSum > target) {
					currSum -= arr[start];
					start++;
				} else {
					if (end <= arr.length - 1) {
						currSum += arr[end];
					}
					end++;
				}
			}
		}
	}
    static void dis(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        
        //int[] arr = {1,2,3,7,5};
        //subArray(arr,15);
        //subarraySum(arr.length,12,arr);
        SubArray(arr,12);
    }
}