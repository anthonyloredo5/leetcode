class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();

        // Step 2: Split the string by one or more spaces
        String[] words = s.split("\\s+");

        // Step 3: Reverse the words using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" "); // Add space between words
            }
        }

        return sb.toString();
    }
}


