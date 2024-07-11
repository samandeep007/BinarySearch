public class RBS {
    public static void main(String[] args) {

    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int midpoint = start + (end-start)/2;
            if(midpoint < end && arr[midpoint] > arr[midpoint + 1]){
                return midpoint;
            }
            if(midpoint > start && arr[midpoint]<arr[midpoint - 1]){
                return midpoint - 1;
            }
            if(arr[midpoint] <= arr[start]){
                end = midpoint - 1;
            }
            else {
                start = midpoint + 1;
            }
        }
        return -1;
    }

      static int search(int[] nums, int target) {
          int start = 0;
          int end = nums.length - 1;
          int pivot = findPivot(nums);
          int index = binarySearch(nums, target, start, pivot);

          if (index != -1) {
              index = binarySearch(nums, target, pivot + 1, end);
          }

          return index;
      }

    static int binarySearch(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int midpoint = start + (end-start)/2;
        if(arr[midpoint]>target){
            return binarySearch(arr, target, start, midpoint-1);
        }
        else if(arr[midpoint]<target){
            return binarySearch(arr, target, midpoint + 1, end);
        }
        else {
            return midpoint;
        }
    }
}
