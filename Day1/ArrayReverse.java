class ArrayReverse{
    static void reverse1(int[] arr ,int n){
        int i=0;
        while(i<n){
            //swap(arr[i],arr[n]);
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++; n--;
        }
    }
    static void reverse2(int[] arr ,int start,int end){
            if(start>= end)
                return;
            reverse2(arr,start+1,end -1);
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    }
    static void dis(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int len = arr.length -1;
        System.out.println("Reverse Array using brute force");
        reverse1(arr,len);
        dis(arr);
        System.out.println("Reverse Array using Recursion");
        reverse2(arr, 0,len);
        dis(arr);
    }
}