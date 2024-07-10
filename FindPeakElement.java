public class FindPeakElement {
    public static void main(String[] args){
        int[] numbers = {4,5,6,7,9,3,2,1};
        System.out.println(findPeakElement(numbers));


    }

    static int findPeakElement(int[] nums){
        if(nums.length == 1){
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            int midpoint = start + (end-start) / 2;
            if(nums[midpoint] < nums[midpoint+1]){
                start = midpoint + 1;
            }
            else{
                end = midpoint;
            }
        }
        return end;
    }
}
