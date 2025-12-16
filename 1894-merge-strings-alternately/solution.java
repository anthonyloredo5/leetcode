class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();

        int i = 0;

        //Merge while both strings have characters
        while(i < word1.length() && i < word2.length()) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
            i++;
        }

        // Append remaining characters
        if (i < word1.length()) {
            merged.append(word1.substring(i));
        }

        if (i < word2.length()) {
            merged.append(word2.substring(i));
        }
        return merged.toString();
    }
}
