public class InfiniteSortedArray {
    public static void main(String[] args) {

    }

    static int searchInfiniteSortedArray(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end]<target){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
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
