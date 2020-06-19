//Find the max sub array and also start and end index of an array
// check the git branch only
class FindMaxSubArray{
    public static void findMaxSubArray(int[] arr){

        int startIndex = 0;
        int endIndex = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentStart = 0;
        int currentSum =0;
        for(int i=0;i<arr.length;i++){
            currentSum += arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
                startIndex = currentStart;
                endIndex = i;
            }
            if(currentSum < 0){
                currentSum =0;
                currentStart = i+1;
            }
        }
    
        System.out.println("Max sum         : "+maxSum);
        System.out.println("Max start index : "+startIndex);
        System.out.println("Max end index   : "+endIndex);
    }
    public static void main(String[] args) {
        //int arr[] = {-3, 4, -1, -2, 1, 5 ,-5,-20};
        int[] arr = {-7,-1, 4, 5, 2, 0, 3, 0};
        findMaxSubArray(arr);
    }
}
