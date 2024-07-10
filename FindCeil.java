public class FindCeil {
    public static void main(String[] args){
        int[] numbers = {1,3,5,12,15,19,21};
        System.out.println(ceil(numbers, 13));

    }

    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int midpoint = start + (end-start) / 2;
            if(arr[midpoint]>target){
                end = midpoint - 1;
            }
            else if(arr[midpoint] < target){
                start = midpoint + 1;
            }
            else {
                return arr[midpoint];
            }

        }
        return arr[start];
    }
}
