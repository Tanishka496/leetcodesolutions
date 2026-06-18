class Solution {
    public int reversePairs(int[] nums) 
    {
        return mergeSort(nums,0,nums.length-1);
        
    }
    private int mergeSort(int [] nums,int low,int high)
    {
        if(low>=high) return 0;


        int count =0;
        int mid = low+(high-low)/2;

        count+=mergeSort(nums,low,mid);

        count+=mergeSort(nums,mid+1,high);
         
        count+=countPairs(nums,low,mid,high);

        merge(nums,low,mid,high);

        return count;


    }

     private int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (j <= high && (long)arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        return count;
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= high) temp[k++] = arr[j++];

        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
        }
    }
}