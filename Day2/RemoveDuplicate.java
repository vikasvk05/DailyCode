// Remove Duplicate element from sorted array
class RemoveDuplicate{
    static int remove_duplicate(int a[])
	{
		// Your code here
		int count =0;
		int len = a.length;
		for(int i=1;i<len;i++){
		    if(a[i] == a[i-1]){
		        count++;
		        a[i-1] = -1;
		    }
		}
		int[] arr = new int[len - count];
		for(int i=0,j=0;i<len;i++){
		    if(a[i] != -1){
		        a[j] = a[i];

		        j++;
		    }
		}
		a = arr;
		return len-count;
	}
	public static void main(String[] args) {
		
        int[] arr = {2,3,4,4,4,5};
        //int[] arr = {2,2,2,2,2};
		int n = remove_duplicate(arr);
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]);
		}
	}
}