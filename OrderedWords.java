public class OrderedWords {

    public static void main(String[] args) {
        String input1 = "accept Van";
        int result = findOrderedWords(input1);
        System.out.println(result); // Output should be 2
    }

    public static int findOrderedWords(String input1) {
        String[] words = input1.split("\\s+");
        int orderedCount = 0;

        for (String word : words) {
            boolean isOrdered = true;
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) > word.charAt(i + 1)) {
                    isOrdered = false;
                    break;
                }
            }
            if (isOrdered) {
                orderedCount++;
            }
        }
        return orderedCount;

    }
}
