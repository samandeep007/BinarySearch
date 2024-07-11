public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] numbers = {{1,2,3}, {7,9,10}, {11,12,18}};
        int target = 19;
        System.out.println(searchIn2DArray(numbers, target));
    }

    static boolean searchIn2DArray(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (arr[midpoint][0] == target) {
                return true;
            }
            if (arr[midpoint][0] > target) {
                end = midpoint - 1;
            } else {
                int index = binarySearch(arr[midpoint], target);
                if (index == -1) {
                    start = midpoint + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }


    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int midpoint = start + (end-start)/2;
            if(arr[midpoint] == target){
                return midpoint;
            }
            else if(arr[midpoint]>target){
                end = midpoint - 1;
            }

            else {
                start = midpoint + 1;
            }
        }
        return -1;
    }
}
