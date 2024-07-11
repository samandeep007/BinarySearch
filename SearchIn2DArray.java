import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] numbers = {{1,2,3}, {7,9,10}, {11,12,18}};
        int target = 12;
        System.out.println(Arrays.toString(searchIn2DArray(numbers, target)));
    }

    static int[] searchIn2DArray(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        while (start <= end) {

            int midpoint = start + (end - start) / 2;
            if (matrix[midpoint][0] == target) {
                return new int[]{midpoint, 0};
            }

            if(matrix[midpoint][matrix[midpoint].length - 1] == target){
                return new int[]{midpoint, matrix[midpoint].length-1};
            }

            if(matrix[midpoint][0] < target && matrix[midpoint][matrix[midpoint].length - 1] > target){

                int index = binarySearch(matrix[midpoint], target);
                if(index!=-1){
                    return new int[]{midpoint, index};
                }
                return new int[]{-1, -1};
            }

            else if (matrix[midpoint][0] > target) {
                end = midpoint - 1;
            }

            else {
                   start = midpoint + 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] searchInMatrix(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target ){
                return new int[]{row, column};
            }
            if(matrix[row][column] > target){
                column--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1,-1};
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
