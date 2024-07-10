class Solution {
    public int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeak(mountainArr);

        // Try to find the target in the increasing part
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) {
            return index;
        }

        // If not found, try to find the target in the decreasing part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length - 1, false);
    }

    private int findPeak(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length- 1;

        while (start < end) {
            int midpoint = start + (end - start) / 2;
            if (mountainArr[midpoint] < mountainArr[midpoint + 1]) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }

        return start; // start and end will converge to the peak index
    }

    private int binarySearch(int[] mountainArr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            int value = mountainArr[midpoint];

            if (value == target) {
                return midpoint;
            }

            if (ascending) {
                if (value < target) {
                    start = midpoint + 1;
                } else {
                    end = midpoint - 1;
                }
            } else {
                if (value < target) {
                    end = midpoint - 1;
                } else {
                    start = midpoint + 1;
                }
            }
        }

        return -1; // target not found
    }
}
