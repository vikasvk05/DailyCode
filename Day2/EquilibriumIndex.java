/*Description - Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the
sum of elements at higher indexes. We are given an Array of integers, We have to find out the first index i from left 
such that */
class EquilibriumIndex{
    static int fun(int[] arr){
        int n = arr.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Sum:"+sum);
        int leftSum =0;
        for(int i=0;i<n;i++){
            sum -= arr[i];
            System.out.println(" Before sum new :"+sum+" leftsum:"+leftSum);
            if(sum == leftSum) 
                return i;
            leftSum += arr[i];
            System.out.println("sum new :"+sum+" leftsum:"+leftSum);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-7, 4, 5, 2, 0, 3, 0};
        System.out.println(fun(arr));
    }
}