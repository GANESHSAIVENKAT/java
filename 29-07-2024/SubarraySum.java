public class SubarraySum {

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 1, 7, 8, 2, 3, 4};
        int target = 7;
        findSubarraysWithTargetSum(array, target);
    }

    public static void findSubarraysWithTargetSum(int[] array, int target) {
        int n = array.length;

        // Iterate over all possible starting points of subarrays
        for (int start = 0; start < n; start++) {
            int currentSum = 0;

            // Iterate over all possible ending points of subarrays starting from 'start'
            for (int end = start; end < n; end++) {
                currentSum += array[end];

                // If the sum matches the target, print the subarray
                if (currentSum == target) {
                    printSubarray(array, start, end);
                }
            }
        }
    }

    public static void printSubarray(int[] array, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
