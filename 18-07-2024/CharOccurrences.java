public class CharOccurrences {
    public static int countOccurrences(char target, char[] array) {
        int count = 0;
        for (char c : array) {
            if (c == target) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'a', 'b', 'a'};
        char target = 'a';
        System.out.println("The character '" + target + "' occurs " + (target, array) + " times in the array.");
    }
}