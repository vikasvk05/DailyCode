// Time complexcity is O(n)
class WindowSlidTech{
    static void slidWindow(int[] arr,int k){
        int max = 0;
        int window_sum = 0;
        for(int i=0;i<k;i++){
            window_sum += arr[i];
        }
        max = window_sum;
        //System.out.println("Window sum:"+window_sum);
        for(int i=k;i<arr.length;i++){
            window_sum += arr[i] - arr[i-k];
            //System.out.println("Window sum:"+window_sum);
            if(window_sum > max)
                max = window_sum;
        }
        System.out.println("Max Window sum is:"+max);
    }
    static void dis(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int[] arr = { 5,2,-1,7,3};
        int k =3;
        slidWindow(arr,k);
    }
}