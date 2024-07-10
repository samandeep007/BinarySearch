public class FindInMountainArray {
    public static void main(String[] args) {

    }

    static int findInMountainArray(int target, int[] mountainArr){
        int start = 0;
        int end = mountainArr.length - 1;
        while(start<=end){
            int midpoint = start + (end-start)/2;
            if(mountainArr[midpoint] == target){
                return midpoint;
            }
            else if(mountainArr[midpoint] > mountainArr[midpoint+1]){
                end = midpoint;
            }
            else {
                start = midpoint + 1;
            }

        }
        return -1;
    }

}

