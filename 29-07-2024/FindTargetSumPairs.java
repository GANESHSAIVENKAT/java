public class FindTargetSumPairs {
    
    public static void findPairs(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
				if(array[i] + array[j]== target) {
					System.out.println("[" + array[i] + "," + array[j] +"]");
				}
				for (int k = j + 2; k < array.length; k++) {
                if (array[i] + array[j]+array[k] == target) {
                    System.out.println("[" + array[i] + "," + array[j] +","+array[k]+ "]");
				}
                }
            }
        }
    }
}