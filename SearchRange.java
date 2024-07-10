import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
  int[] numbers = {5,7,7,8,8,10};
  int target = 8;
        System.out.println(Arrays.toString(searchRange(numbers, target)));

    }

    static int[] searchRange(int[] nums, int target){
        int result[] = new int[2];
        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);
        return result;
    }

    static int search(int[] arr, int target, boolean isFirstOccurrence){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while(start<=end){
            int midpoint = start + (end - start)/2;
            if(arr[midpoint]>target){
                end = midpoint - 1;
            }
            else if(arr[midpoint]<target){
                start = midpoint + 1;
            }
            else {
                index = midpoint;
                if(isFirstOccurrence){
                    end = midpoint - 1;
                }
                else {
                    start = midpoint + 1;
                }
            }
        }
        return index;
    }

}

